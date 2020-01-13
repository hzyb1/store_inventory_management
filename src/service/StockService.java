package service;

import java.util.List;

import po.InStockPo;
import po.InStockVo;
import po.OutStockPo;
import po.OutStockVo;
import po.StockVo;
import model.Product;
import model.Stock;

public interface StockService {
	public Stock selectStockById(int id);
	public List<StockVo> selectAllStock();
	public Boolean addStock(Stock stock);
	public Boolean insertStock(Stock stock);
	public boolean deleteStock(int id);
	public boolean inStockOption(List<InStockPo> inStockPos);
	public boolean OuStockOption(List<OutStockPo> outStockPos);
	public List<OutStockVo> selectAllOutStock();
	public List<InStockVo> selectAllInStock();
}
