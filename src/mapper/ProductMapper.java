package mapper;

import java.util.List;

import model.Product;
import model.Stock;

public interface ProductMapper {
	public Product selectById(int id);
	public List<Product> selectAll();
	public boolean updateProduct(Product product);
	public boolean insertProduct(Product product);
	public boolean deleteById(int id);
}
