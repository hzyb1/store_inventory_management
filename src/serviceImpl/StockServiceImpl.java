package serviceImpl;

import java.sql.Timestamp;
import java.util.List;

import org.apache.ibatis.session.SqlSession;











import po.InStockPo;
import po.InStockVo;
import po.OutStockPo;
import po.OutStockVo;
import po.StockVo;
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
	public Boolean insertStock(Stock stock) {
		try{
			sqlSession=DBTools.getSession(); 
			StockMapper stockMapper = sqlSession.getMapper(StockMapper.class);
			boolean state = stockMapper.insertStock(stock);
			sqlSession.commit();
			return state;
		}catch(Exception e){
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
			inStockMapper.insertInStock(inStock);
			for(int i = 0;i<inStockPos.size();i++){
				InStockDetail inStockDetail = new InStockDetail();
				inStockDetail.setInStorkId(inStock.getId());
				inStockDetail.setAmount(inStockPos.get(i).getAmount());
				inStockDetail.setProductId(inStockPos.get(i).getProductId());
				
				Stock stock = new Stock();
				stock.setAmount(inStockPos.get(i).getAmount());
				stock.setAreaNumber(inStockPos.get(i).getAreaNumber());
				stock.setInStockTime(inStockPos.get(i).getInStockTime());
				stock.setPlaceNumber(inStockPos.get(i).getPlaceNumber());
				stock.setProductId(inStockPos.get(i).getProductId());
				stock.setShelfNumber(inStockPos.get(i).getShelfNumber());
				stockMapper.insertStock(stock);
				
				
			}
			
			
		  } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			sqlSession.rollback();
			return false;
		}finally{
			sqlSession.close();
			
		}
		
		return false;
	}

	@Override
	public boolean OuStockOption(List<OutStockPo> outStockPos) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<OutStockVo> selectAllOutStock() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<InStockVo> selectAllInStock() {
		// TODO Auto-generated method stub
		return null;
	}
	}

