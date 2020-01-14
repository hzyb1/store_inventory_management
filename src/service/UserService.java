package service;

import model.User;
import java.util.List;
public interface UserService {
	public User login(String account,String password);	//登陆
	public Boolean addUser(User user);	//添加用户	
	public Boolean updateUser(User user);	//更新用户
	public User selectUserById(int id);	//选择
	public List<User> selectAllUser();	//查找所有用户
	public boolean deleteUser(int id);	//删除用户
}
