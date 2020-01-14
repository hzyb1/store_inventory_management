package service;

import model.User;
import java.util.List;
public interface UserService {
	public User login(String account,String password);	//��½
	public Boolean addUser(User user);	//����û�	
	public Boolean updateUser(User user);	//�����û�
	public User selectUserById(int id);	//ѡ��
	public List<User> selectAllUser();	//���������û�
	public boolean deleteUser(int id);	//ɾ���û�
}
