package mapper;

import java.util.List;

import po.ProductVo;
import model.Product;
import model.Stock;

public interface ProductMapper {
	public Product selectById(int id);
	public List<ProductVo> selectAll();
	public List<Product> selectAllProduct();
 	public boolean updateProduct(Product product);
	public boolean insertProduct(Product product);
	public boolean deleteById(int id);
}
