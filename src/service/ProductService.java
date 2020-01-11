package service;

import java.util.List;

import model.Product;

public interface ProductService {
	public List<Product> selectAllProduct();
	public Boolean updateProduct(Product product);
	public Product selectProductById(int id);
	public Boolean insertProduct(Product product);
	public boolean deleteProduct(int id);
}
