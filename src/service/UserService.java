package service;

import model.User;
import java.util.List;
public interface UserService {
	public User login(String account,String password);
	public Boolean addUser(User user);
	public Boolean updateUser(User user);
	public User selectUserById(int id);
	public List<User> selectAllUser();
}
