package mapper;

import java.util.List;

import model.InStock;

public interface InStockMapper {
	public InStock selectById(int id);
	public List<InStock> selectAllInStock();
	public boolean updateInStock(InStock inStock);
	public boolean insertInStock(InStock inStock);
	public boolean deleteById(int id);
}
