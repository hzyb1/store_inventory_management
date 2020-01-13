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
import mapper.OutStockDetailMapper;
import mapper.OutStockMapper;
import mapper.StockMapper;
import model.InStock;
import model.InStockDetail;
import model.OutStock;
import model.OutStockDetail;
import model.Stock;
import service.StockService;
import tools.DBTools;
public class StockServiceImpl implements StockService{
  SqlSession sqlSession;
  StockMapper stockMapper;
  InStockMapper inStockMapper;
  InStockDetailMapper inStockDetailMapper;
  OutStockMapper outStockMapper;
  OutStockDetailMapper outStockDetailMapper;

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
	public List<InStockVo> selectAllInStock() {
		List<InStockVo> inStockVos = null;
	      try {
			sqlSession=DBTools.getSession();
			inStockMapper = sqlSession.getMapper(InStockMapper.class);
			inStockVos=inStockMapper.selectAll();
			
		  } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			sqlSession.rollback();
			return inStockVos;
		}finally{
			sqlSession.close();
			
		}
		
		return inStockVos;
	}

	@Override
	public boolean outStockOption(List<OutStockPo> outStockPos) {
		if(outStockPos == null || outStockPos.size() == 0)	return false;
		OutStock outStock = new OutStock();
		outStock.setApprover(outStockPos.get(0).getApproverId());
		Timestamp submitTime = new Timestamp(System.currentTimeMillis());
		outStock.setCompleteTime(submitTime);
		try {
			sqlSession=DBTools.getSession();
			outStockMapper = sqlSession.getMapper(OutStockMapper.class);
			outStockDetailMapper = sqlSession.getMapper(OutStockDetailMapper.class);
			stockMapper = sqlSession.getMapper(StockMapper.class);
			outStockMapper.insertOutStock(outStock);
			for(int i = 0;i<outStockPos.size();i++){
				OutStockDetail outStockDetail = new OutStockDetail();
				outStockDetail.setOutStockId(outStock.getId());
				outStockDetail.setAmount(outStockPos.get(i).getAmount());
				outStockDetail.setProductId(outStockPos.get(i).getProductId());
				outStockDetailMapper.insertOutStockDetail(outStockDetail);
				stockMapper.deleteById(outStockPos.get(0).getId());
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
	public boolean deleteInStockDetail(int id) {
		try{
			sqlSession=DBTools.getSession(); 
			inStockDetailMapper = sqlSession.getMapper(InStockDetailMapper.class);
			boolean state = inStockDetailMapper.deleteById(id);
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
	public OutStockPo addToOutList(int id) {
		OutStockPo outStockPo;
		try {
			sqlSession=DBTools.getSession();
			InStockMapper instockMapper=sqlSession.getMapper(InStockMapper.class);
			stockMapper = sqlSession.getMapper(StockMapper.class);
			outStockPo = (OutStockPo) stockMapper.selectOutStockPo(id);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			sqlSession.rollback();
			return null;
		}finally{
			sqlSession.close();
		}
		return outStockPo;
	}


}