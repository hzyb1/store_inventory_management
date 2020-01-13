package serviceImpl;

import java.sql.Timestamp;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import po.InStockPo;
import po.InStockVo;
import po.OutStockPo;
import po.OutStockVo;
import po.StockVo;
import mapper.InStockDetailMapper;
import mapper.InStockMapper;
import mapper.StockMapper;
import model.InStock;
import model.InStockDetail;
import model.Stock;
import service.StockService;
import tools.DBTools;
public class StockServiceImpl implements StockService{
  SqlSession sqlSession;
  StockMapper stockMapper;
  InStockMapper inStockMapper;
  InStockDetailMapper inStockDetailMapper;

  @Override
	public List<StockVo> selectAllStock() {
		List<StockVo> StockVos;
	      try {
			sqlSession=DBTools.getSession();
			StockMapper stockMapper = sqlSession.getMapper(StockMapper.class);
			StockVos=stockMapper.selectAll();
			
		  } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			sqlSession.rollback();
		   return null;
		}finally{
			sqlSession.close();
		}
	  	return StockVos;
		}
	
	@Override
	public Boolean addStock(Stock stock) {
		try {
			sqlSession=DBTools.getSession();
			StockMapper stockMapper = sqlSession.getMapper(StockMapper.class);
			boolean state=stockMapper.updateStock(stock);
			sqlSession.commit();
			return state;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			sqlSession.rollback();
			return null;
		}finally{
		sqlSession.close();
	     }
	
	}


	@Override
	public boolean deleteStock(int id) {
		try{
			sqlSession=DBTools.getSession(); 
			StockMapper stockMapper = sqlSession.getMapper(StockMapper.class);
			boolean state = stockMapper.deleteById(id);
			sqlSession.commit();
			return state;
		}catch(Exception e){
			e.printStackTrace();
			sqlSession.rollback();
		}finally{
			sqlSession.close();
		}
		return false;
	}

	@Override
	public Stock selectStockById(int id) {
		try{
			sqlSession=DBTools.getSession(); 
			StockMapper stockMapper = sqlSession.getMapper(StockMapper.class);
			Stock stock = stockMapper.selectById(id);
			return stock;
		}catch(Exception e){
			e.printStackTrace();
			sqlSession.rollback();
			return null;
		}finally{
			sqlSession.close();
	}

	}

	@Override
	public boolean inStockOption(List<InStockPo> inStockPos) {
		if(inStockPos == null || inStockPos.size() == 0)	return false;
		InStock inStock = new InStock();
		inStock.setApprover(inStockPos.get(0).getApproverId());
		Timestamp submitTime = new Timestamp(System.currentTimeMillis());
		inStock.setCompleteTime(submitTime);
		inStock.setSupplierId(inStockPos.get(0).getSupplierId());
		try {
			sqlSession=DBTools.getSession();
			inStockMapper = sqlSession.getMapper(InStockMapper.class);
			inStockDetailMapper = sqlSession.getMapper(InStockDetailMapper.class);
			stockMapper = sqlSession.getMapper(StockMapper.class);
			inStockMapper.insertInStock(inStock);
			for(int i = 0;i<inStockPos.size();i++){
				InStockDetail inStockDetail = new InStockDetail();
				inStockDetail.setInStockId(inStock.getId());
				inStockDetail.setAmount(inStockPos.get(i).getAmount());
				inStockDetail.setProductId(inStockPos.get(i).getProductId());
				inStockDetailMapper.insertInStockDetail(inStockDetail);
				
				Stock stock = new Stock();
				stock.setAmount(inStockPos.get(i).getAmount());
				stock.setAreaNumber(inStockPos.get(i).getAreaNumber());
				stock.setInStockTime(inStockPos.get(i).getInStockTime());
				stock.setPlaceNumber(inStockPos.get(i).getPlaceNumber());
				stock.setProductId(inStockPos.get(i).getProductId());
				stock.setShelfNumber(inStockPos.get(i).getShelfNumber());
				stockMapper.insertStock(stock);
				sqlSession.commit();
			}
		}catch(Exception e){
			e.printStackTrace();
			sqlSession.rollback();
			return false;
		}finally{
			sqlSession.close();
		}
		return true;
	}
			

	@Override
	public List<InStock> selectAllInStock() {
		List<InStock> inStocks = null;
	      try {
			sqlSession=DBTools.getSession();
			InStockMapper instockMapper = sqlSession.getMapper(InStockMapper.class);
			inStocks=instockMapper.selectAll();
			
		  } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			sqlSession.rollback();
			return inStocks;
		}finally{
			sqlSession.close();
			
		}
		
		return inStocks;
	}

	@Override
	public boolean outStockOption(List<OutStockPo> outStockPos) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<OutStockVo> selectAllOutStock() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean updateInStock(InStock instock) {
	    try {
			sqlSession=DBTools.getSession();
			InStockMapper instockMapper = sqlSession.getMapper(InStockMapper.class);
       Boolean state=instockMapper.updateInStock(instock);
         sqlSession.commit();
         return state;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			sqlSession.rollback();
			return null;
		}finally{
			sqlSession.close();
		}
		
	}

	@Override
	public Boolean insertInStock(InStock instock) {
		try {
			sqlSession=DBTools.getSession();
			InStockMapper instockMapper=sqlSession.getMapper(InStockMapper.class);
			boolean state=instockMapper.insertInStock(instock);
			return state;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			sqlSession.rollback();
			return null;
		}finally{
			sqlSession.close();
		}

	}

	@Override
	public boolean deleteInStock(int id) {
		try {
			sqlSession=DBTools.getSession();
			InStockMapper instockMapper=sqlSession.getMapper(InStockMapper.class);
			boolean state=instockMapper.deleteById(id);
			return state;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			sqlSession.rollback();


		}finally{
			sqlSession.close();
		}

return false;	
	}

	@Override
	public InStockDetail selectInStocktDetailById(int id) {
		try{
			sqlSession=DBTools.getSession(); 
			InStockDetailMapper instockdetailMapper = sqlSession.getMapper(InStockDetailMapper.class);
			InStockDetail instockdetail = instockdetailMapper.selectById(id);
			return instockdetail;
		}catch(Exception e){
			e.printStackTrace();
			sqlSession.rollback();
			return null;
		}finally{
			sqlSession.close();
	}
	}

	@Override
	public List<InStockDetail> selectAllInStockDetail() {
		List<InStockDetail> instockdetail;
	      try {
			sqlSession=DBTools.getSession();
			InStockDetailMapper instockdetailMapper = sqlSession.getMapper(InStockDetailMapper.class);
			instockdetail=instockdetailMapper.selectAll();
			
		  } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			sqlSession.rollback();
		   return null;
		}finally{
			sqlSession.close();
		}
	  	return instockdetail;
	}

	@Override
	public Boolean updateInStockDetail(InStockDetail instockdetail) {
		try {
			sqlSession=DBTools.getSession();
			InStockDetailMapper instockdetailMapper = sqlSession.getMapper(InStockDetailMapper.class);
       Boolean state=instockdetailMapper.updateInStockDetail(instockdetail);
         sqlSession.commit();
         return state;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			sqlSession.rollback();
			return null;
		}finally{
			sqlSession.close();
		}
	}

	@Override
	public Boolean insertInStockDetail(InStockDetail instockdetail) {
		try {
			sqlSession=DBTools.getSession();
			InStockDetailMapper instockdetailMapper = sqlSession.getMapper(InStockDetailMapper.class);
			boolean state=instockdetailMapper.insertInStockDetail(instockdetail);
			return state;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			sqlSession.rollback();
			return null;
		}finally{
			sqlSession.close();
		}
	}

	@Override
	public boolean deleteInStockDetail(int id) {
		try {
			sqlSession=DBTools.getSession();
			InStockDetailMapper instockdetailMapper = sqlSession.getMapper(InStockDetailMapper.class);
			boolean state=instockdetailMapper.deleteById(id);
			return state;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			sqlSession.rollback();


		}finally{
			sqlSession.close();
		}
		return false;

	}

	@Override
	public InStock selectInStocktById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}