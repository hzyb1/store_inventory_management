package service;

import java.util.List;

import po.ProductVo;
import model.Product;

public interface ProductService {
	public List<ProductVo> selectAllProduct();
	public Boolean updateProduct(Product product);
	public Product selectProductById(int id);
	public Boolean addProduct(Product product);
	public boolean deleteProduct(int id);
	public List<Product> listAllProduct();
}
