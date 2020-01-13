package serviceImpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import po.ProductVo;
import mapper.ProductMapper;


import mapper.SupplierMapper;
import model.Product;
import model.Supplier;
import service.ProductService;
import tools.DBTools;

public class ProductServiceImpl implements ProductService{
       SqlSession sqlSession;
      ProductMapper productMapper;
	
	

	@Override
	public Boolean addProduct(Product product) {
		try{
			sqlSession=DBTools.getSession(); 
			ProductMapper productMapper = sqlSession.getMapper(ProductMapper.class);
			boolean state = productMapper.insertProduct(product);
			sqlSession.commit();
			return state;
		}catch(Exception e){
			e.printStackTrace();
			sqlSession.rollback();
			return null;
		}finally{
			sqlSession.close();
		}
	}
	

	@Override
	public boolean deleteProduct(int id) {
		try{
			sqlSession=DBTools.getSession(); 
			ProductMapper productMapper = sqlSession.getMapper(ProductMapper.class);
			boolean state = productMapper.deleteById(id);
			sqlSession.commit();
			return state;
		}catch(Exception e){
			e.printStackTrace();
			sqlSession.rollback();
		}finally{
			sqlSession.close();
		}
		return false;
	}

	

	@Override
	public Product selectProductById(int id) {
		try{
			sqlSession=DBTools.getSession(); 
			ProductMapper productMapper = sqlSession.getMapper(ProductMapper.class);
			Product product = productMapper.selectById(id);
			return product;
		}catch(Exception e){
			e.printStackTrace();
			sqlSession.rollback();
			return null;
		}finally{
			sqlSession.close();
		}
	}


	@Override
	public Boolean updateProduct(Product product) {
		try {
			sqlSession=DBTools.getSession();
			ProductMapper productMapper = sqlSession.getMapper(ProductMapper.class);
			boolean state=productMapper.updateProduct(product);
			sqlSession.commit();
			return state;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			sqlSession.rollback();
			return null;
		}finally{
		  sqlSession.close();
	     }
	}


	@Override
	public List<ProductVo> selectAllProduct() {
		List<ProductVo> productVos;
      try {
		sqlSession=DBTools.getSession();
		ProductMapper productMapper =sqlSession.getMapper(ProductMapper.class);
		productVos = productMapper.selectAll();
		
	  } catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		sqlSession.rollback();
	   return null;
	}finally{
		sqlSession.close();
	}
  	return productVos;
	}


	@Override
	public List<Product> listAllProduct() {
		List<Product> products;
	      try {
			sqlSession=DBTools.getSession();
			ProductMapper productMapper =sqlSession.getMapper(ProductMapper.class);
			products = productMapper.selectAllProduct();
			
		  } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			sqlSession.rollback();
		   return null;
		}finally{
			sqlSession.close();
		}
	  	return products;
	}

}
