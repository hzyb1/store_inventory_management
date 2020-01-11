package action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionContext;

import model.Product;
import model.User;
import po.ProductVo;
import serviceImpl.ProductServiceImpl;

public class ProductAction {
	private int id;
	private Product changeProduct;
	private List<ProductVo> productVos;
	private Product product;
	private ProductServiceImpl productServiceImpl = new ProductServiceImpl();
	private String message; 
	
	
	public Product getChangeProduct() {
		return changeProduct;
	}



	public void setChangeProduct(Product changeProduct) {
		this.changeProduct = changeProduct;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public ProductServiceImpl getProductServiceImpl() {
		return productServiceImpl;
	}



	public void setProductServiceImpl(ProductServiceImpl productServiceImpl) {
		this.productServiceImpl = productServiceImpl;
	}



	public String getMessage() {
		return message;
	}



	public void setMessage(String message) {
		this.message = message;
	}



	public List<ProductVo> getProductVos() {
		return productVos;
	}



	public void setProductVos(List<ProductVo> productVos) {
		this.productVos = productVos;
	}



	public Product getProduct() {
		return product;
	}



	public void setProduct(Product product) {
		this.product = product;
	}



	public String checkAllProduct() {
		productVos =  productServiceImpl.selectAllProduct();
		if(productVos != null)
		ActionContext.getContext().put("productVos", productVos);
		
		return "success";
	}
	
	public String addProduct() {
		if (productServiceImpl.addProduct(product)) {
			message = "添加成功";
			System.out.println(message);
			return "success";
		} else {
			message = "添加失败！";
			System.out.println(message);
			return "error";
		}
	}
	public String deleteProduct() {
		if (productServiceImpl.deleteProduct(id)) {
			message = "删除成功";
			return "success";
		} else {
			return "error";
		}
	}
	
	public String updateProductForm() {
		System.out.println(id+"aaaaaa");
		changeProduct = productServiceImpl.selectProductById(id);
		//ActionContext.getContext().put("changeUser", changeUser);
		return "success";
	}
	
	public String updateProduct() {
		if (productServiceImpl.updateProduct(changeProduct)) {
			message = "更新用户成功！";
		} else {
			message = "更新用户失败！";
		}
		return "success";
	}
}
