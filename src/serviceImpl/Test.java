package serviceImpl;

import java.util.List;

import po.ProductVo;
import model.Product;
import model.Supplier;
import model.User;

//public class Test {
//	public static void main(String[] args) {
//		UserServiceImpl userServiceImpl = new UserServiceImpl();
//		User user = userServiceImpl.selectUserById(2);
//		user.setName("����");
//		userServiceImpl.addUser(user);
//	}
//}
public class Test{
	
	public static void main(String[] args)
	{
		ProductServiceImpl productrServiceImpl =new ProductServiceImpl();
		List<ProductVo> productVos = productrServiceImpl.selectAllProduct();
//         product.setName("leshi");	
//	    productrServiceImpl.insertProduct(product);
		System.out.println(productVos.size()+"aaaaaaaa");
		System.out.println(productVos.get(0).getAmount());
}
}