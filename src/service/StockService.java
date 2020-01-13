package service;

import java.util.List;

import po.InStockPo;
import po.InStockVo;
import po.OutStockPo;
import po.OutStockVo;
import po.StockVo;
import model.InStockDetail;
import model.OutStock;
import model.Product;
import model.Stock;
import model.InStock;
public interface StockService {
	public Stock selectStockById(int id);
	public List<StockVo> selectAllStock();
	public Boolean addStock(Stock stock);
	public boolean deleteStock(int id);
	public boolean inStockOption(List<InStockPo> inStockPos);
	public boolean outStockOption(List<OutStockPo> outStockPos);
	public List<OutStockVo> selectAllOutStock();
	public InStock selectInStocktById(int id);
	public List<InStock> selectAllInStock();
	public Boolean updateInStock(InStock instock);
	public Boolean insertInStock(InStock instock);
	public boolean deleteInStock(int id);
	public InStockDetail selectInStocktDetailById(int id);
	public List<InStockDetail> selectAllInStockDetail();
	public Boolean updateInStockDetail(InStockDetail inStockDetail);
	public Boolean insertInStockDetail(InStockDetail inStockDetail);
	public boolean deleteInStockDetail(int id);
	
<<<<<<< HEAD
	public OutStock selectOutStocktById(int id);
	public List<OutStock> selectAllOutStock();
	public Boolean updateOutStock(OutStock outStock);
	public Boolean insertOutStock(OutStock outStock);
	public boolean deleteOutStock(int id);
	
=======
>>>>>>> 2282696dd313eb7d09f5f6a287999080fd25ffe2
}
