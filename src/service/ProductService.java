package service;

import java.util.List;

import po.ProductVo;
import model.Product;

public interface ProductService {
	public List<ProductVo> selectAllProduct();		//�������в�Ʒ��Ϣ
	public Boolean updateProduct(Product product);	//���²�Ʒ��Ϣ
	public Product selectProductById(int id);		//ͨ��id���Ҳ�Ʒ
	public Boolean addProduct(Product product);		//��Ӳ�Ʒ
	public boolean deleteProduct(int id);			//ɾ����Ʒ
	public List<Product> listAllProduct();			//
}
