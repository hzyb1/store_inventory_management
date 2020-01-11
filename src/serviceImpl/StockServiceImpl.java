package serviceImpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import mapper.StockMappper;
import mapper.SupplierMapper;
import model.Stock;
import service.StockService;
import tools.DBTools;

public class StockServiceImpl implements StockService{
  SqlSession sqlSession;
  StockMappper stockMapper;
	@Override
	public List<Stock> selectAllStock() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean updateStock(Stock stock) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean insertStock(Stock stock) {
		try{
			sqlSession=DBTools.getSession(); 
			StockMappper stockMapper = sqlSession.getMapper(StockMappper.class);
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
			StockMappper stockMapper = sqlSession.getMapper(StockMappper.class);
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

	}

