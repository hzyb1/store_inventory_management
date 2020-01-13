package mapper;

import java.util.List;

import model.InStock;
import model.InStockDetail;
import model.Stock;

public interface InStockDetailMapper {
	public InStockDetail selectById(int id);
	public List<InStockDetail> selectAll();
	public boolean updateInStockDetail(InStockDetail inStockDetail);
	public boolean insertInStockDetail(InStockDetail inStockDetail);
	public boolean deleteById(int id);
}	