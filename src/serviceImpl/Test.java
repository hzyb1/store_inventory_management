package serviceImpl;

import java.util.List;

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
		SupplierServiceImpl supplierServiceImpl =new SupplierServiceImpl();
		Supplier supplier=supplierServiceImpl.selectSupplierById(1);
		
		supplier.setName("����");
		supplier.setAddress("�Ϻ�");
//		supplier.setId(2);
		supplier.setPhone("123456");
		supplierServiceImpl.insertSupplier(supplier);
		System.out.println(supplier);
}
}