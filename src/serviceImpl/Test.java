package serviceImpl;

import java.util.List;

import model.Product;
import model.Supplier;
import model.User;

//public class Test {
//	public static void main(String[] args) {
//		UserServiceImpl userServiceImpl = new UserServiceImpl();
//		User user = userServiceImpl.selectUserById(2);
//		user.setName("хунд");
//		userServiceImpl.addUser(user);
//	}
//}
public class Test{
	
	public static void main(String[] args)
	{
		ProductServiceImpl productrServiceImpl =new ProductServiceImpl();
		List<Product> product = productrServiceImpl.selectAllProduct();
//         product.setName("leshi");	
//	    productrServiceImpl.insertProduct(product);
		System.out.println(product);
}
}