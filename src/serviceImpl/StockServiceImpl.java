package serviceImpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;





import mapper.StockMapper;

import model.Stock;

import service.StockService;
import tools.DBTools;

public class StockServiceImpl implements StockService{
  SqlSession sqlSession;
  StockMapper stockMapper;
	@Override
	public List<Stock> selectAllStock() {
		List<Stock> stock;
	      try {
			sqlSession=DBTools.getSession();
			StockMapper stockMapper = sqlSession.getMapper(StockMapper.class);
			stock=stockMapper.selectAll();
			
		  } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			sqlSession.rollback();
		   return null;
		}finally{
			sqlSession.close();
		}
	  	return stock;
		}
	
	@Override
	public Boolean updateStock(Stock stock) {
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
	public Stock selectStocktById(int id) {
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
	}

