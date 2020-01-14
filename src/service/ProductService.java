package service;

import java.util.List;

import po.ProductVo;
import model.Product;

public interface ProductService {
	public List<ProductVo> selectAllProduct();		//查找所有产品信息
	public Boolean updateProduct(Product product);	//更新产品信息
	public Product selectProductById(int id);		//通过id查找产品
	public Boolean addProduct(Product product);		//添加产品
	public boolean deleteProduct(int id);			//删除产品
	public List<Product> listAllProduct();			//
}
