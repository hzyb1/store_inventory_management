package mapper;

import java.util.List;

import model.Stock;
import model.Supplier;

public interface StockMapper {
	public Stock selectById(int id);
	public List<Stock> selectAll();
	public boolean updateStock(Stock stock);
	public boolean insertStock(Stock stock);
	public boolean deleteById(int id);
}
