package serviceImpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import mapper.UserMapper;
import model.User;
import service.UserService;
import tools.DBTools;

public class UserServiceImpl implements UserService{
	UserMapper userMapper;
	SqlSession sqlSession;
	@Override
	public User login(String account, String password) {
		try{
			sqlSession=DBTools.getSession(); 
			UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
			User user = userMapper.selectByAccount(account);
			if(user == null || !password.equals(user.getPassword()))	return null;
			else			return user;
			
		}catch(Exception e){
			e.printStackTrace();
			sqlSession.rollback();
			return null;
		}finally{
			sqlSession.close();
		}
	}
	@Override
	public Boolean updateUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User selectUserById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean addUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> selectAllUser() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
