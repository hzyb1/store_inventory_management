package mapper;

import java.util.List;

import po.OutStockPo;
import po.StockVo;
import model.InStock;
import model.Stock;

public interface StockMapper {
	public Stock selectById(int id);
	public List<StockVo> selectAll();
	public boolean updateStock(Stock stock);
	public boolean insertStock(Stock stock);
	public boolean deleteById(int id);
	public OutStockPo selectOutStockPo(int id);
	
	public List<Stock> selectByProductId(int id);
}
