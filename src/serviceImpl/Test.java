package serviceImpl;

import model.User;

public class Test {
	public static void main(String[] args) {
		String account = "123456";
		String password = "123456";
		UserServiceImpl userServiceImpl = new UserServiceImpl();
		User user = userServiceImpl.login(account, password);
	}
	
}
