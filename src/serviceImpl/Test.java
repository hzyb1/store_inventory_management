package serviceImpl;

import java.util.List;

import model.Product;
import model.Stock;
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
		StockServiceImpl stockServiceImpl =new StockServiceImpl();
		List<Stock> stock =stockServiceImpl.selectAllStock();
//       List<stock>= stockServiceImpl.selectAllStock();
//       
   	System.out.println(stock);
////	stock.setAmount(60);
//	stockServiceImpl.insertStock(stock);
// 	System.out.println(stock);
//	
//}
}
	}