package serviceImpl;

import java.util.List;

import po.ProductVo;
import model.Product;
import model.Stock;
import model.Supplier;
import model.User;
import model.InStock;

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
       StockServiceImpl instockServiceImpl =new StockServiceImpl();
      List<InStock>   instock=   instockServiceImpl.selectAllInStock();
//         instock.setSupplierId(5);
//         instockServiceImpl.insertInStock(instock);
        System.out.println("instock");
	}
}