package serviceImpl;

import java.util.List;

import model.User;

public class Test {
	public static void main(String[] args) {
		UserServiceImpl userServiceImpl = new UserServiceImpl();
		User user = userServiceImpl.selectUserById(3);
		user.setName("∑Á»’Œƒ");
		userServiceImpl.deleteUser(19);
	}
}
