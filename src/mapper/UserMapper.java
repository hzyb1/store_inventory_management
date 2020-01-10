package mapper;

import java.util.List;

import model.User;

public interface UserMapper {
	public User selectById(int id);
	public List<User> selectAll();
	public User selectByAccount(String account);
	public boolean updateUser(User user);
	public boolean insertUser(User user);
	public boolean deleteById(int id);
}
