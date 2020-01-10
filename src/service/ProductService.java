package service;

import model.User;

public interface ProductService {
	public User login(String telephone,String password);
	public Boolean register(User user);
	public Boolean updateUser(User user);
	public User selectUserById(int id);
}
