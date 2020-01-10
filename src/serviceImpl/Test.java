package serviceImpl;

import java.util.List;

import model.User;

public class Test {
	public static void main(String[] args) {
		String account = "123456";
		String password = "123456";
		UserServiceImpl userServiceImpl = new UserServiceImpl();
		List<User> users = userServiceImpl.selectAllUser();
		System.out.println(users.size());
	}
	
}
