package mapper;

import java.util.List;

import po.InStockVo;
import model.InStock;

public interface InStockMapper {
	public InStock selectById(int id);
<<<<<<< HEAD
	public List<InStockVo> selectAll();
=======
	public List<InStock> selectAllInStock();
>>>>>>> 358ed971ab5e9580c5e8e1736ae74414ec06c83a
	public boolean updateInStock(InStock inStock);
	public boolean insertInStock(InStock inStock);
	public boolean deleteById(int id);
}
