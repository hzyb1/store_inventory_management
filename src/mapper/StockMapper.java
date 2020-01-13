package mapper;

import java.util.List;

import po.StockVo;
import model.Stock;

public interface StockMapper {
	public Stock selectById(int id);
	public List<StockVo> selectAll();
	public boolean updateStock(Stock stock);
	public boolean insertStock(Stock stock);
	public boolean deleteById(int id);
}
