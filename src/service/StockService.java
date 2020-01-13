package service;

import java.util.List;

import po.InStockPo;
import po.InStockVo;
import po.OutStockPo;
import po.OutStockVo;
import po.StockVo;
import model.InStockDetail;
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
	
	public List<InStockVo> selectAllInStock();
	public Boolean updateInStock(InStock instock);
	public Boolean insertInStock(InStock instock);
	public boolean deleteInStock(int id);
	
	public boolean deleteInStockDetail(int id);
	
	public OutStockPo addToOutList(int id);
}
