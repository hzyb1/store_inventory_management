package serviceImpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;













import mapper.InStockDetailMapper;
import mapper.InStockMapper;
import mapper.OutStockMapper;
import mapper.StockMapper;
import model.InStock;
import model.InStockDetail;
import model.OutStock;
import model.Stock;
import service.StockService;
import tools.DBTools;

public class StockServiceImpl implements StockService{
  SqlSession sqlSession;
  StockMapper stockMapper;
  InStockMapper instockMaper;
  InStockDetailMapper instockdetailMapper;
  OutStockMapper outStockMaper;
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

	@Override
	public InStock selectInStocktById(int id) {
		try{
			sqlSession=DBTools.getSession(); 
			InStockMapper instockMapper = sqlSession.getMapper(InStockMapper.class);
			InStock instock = instockMapper.selectById(id);
			return instock;
		}catch(Exception e){
			e.printStackTrace();
			sqlSession.rollback();
			return null;
		}finally{
			sqlSession.close();
	}
		}
	@Override
	public List<InStock> selectAllInStock() {
		List<InStock> instock;
	      try {
			sqlSession=DBTools.getSession();
			InStockMapper instockMapper = sqlSession.getMapper(InStockMapper.class);
			instock=instockMapper.selectAllInStock();
			
		  } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			sqlSession.rollback();
		   return null;
		}finally{
			sqlSession.close();
		}
	  	return instock;
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
	public boolean deleteInStock(int id) {
		try {
			sqlSession=DBTools.getSession();
			InStockMapper instockMapper=sqlSession.getMapper(InStockMapper.class);
			boolean state=instockMapper.deleteById(id);
	         sqlSession.commit();
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
	public boolean deleteInStockDetail(int id) {
		try {
			sqlSession=DBTools.getSession();
			InStockDetailMapper instockdetailMapper = sqlSession.getMapper(InStockDetailMapper.class);
			boolean state=instockdetailMapper.deleteById(id);
	         sqlSession.commit();
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
	public OutStock selectOutStocktById(int id) {
		try{
			sqlSession=DBTools.getSession(); 
			OutStockMapper outStockMapper=sqlSession.getMapper(OutStockMapper.class);
			OutStock outStock = outStockMapper.selectById(id);
			return outStock;
		}catch(Exception e){
			e.printStackTrace();
			sqlSession.rollback();
			return null;
		}finally{
			sqlSession.close();
	}
	}

	@Override
	public List<OutStock> selectAllOutStock() {
		List<OutStock> outStock;
	      try {
			sqlSession=DBTools.getSession();
			OutStockMapper outStockMapper=sqlSession.getMapper(OutStockMapper.class);
			outStock=outStockMapper.selectAllOutStock();
		  } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			sqlSession.rollback();
		   return null;
		}finally{
			sqlSession.close();
		}
	  	return outStock;
	}

	@Override
	public Boolean updateOutStock(OutStock outStock) {
		try {
			sqlSession=DBTools.getSession();
			OutStockMapper outStockMapper=sqlSession.getMapper(OutStockMapper.class);
       Boolean state=outStockMapper.updateOutStock(outStock);
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
	public Boolean insertOutStock(OutStock outStock) {
		try {
			sqlSession=DBTools.getSession();
			OutStockMapper outStockMapper=sqlSession.getMapper(OutStockMapper.class);
			boolean state=outStockMapper.insertOutStock(outStock);
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
	public boolean deleteOutStock(int id) {
		try {
			sqlSession=DBTools.getSession();
			OutStockMapper outStockMapper=sqlSession.getMapper(OutStockMapper.class);
			boolean state=outStockMapper.deleteOutStock(id);
	         sqlSession.commit();
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

}