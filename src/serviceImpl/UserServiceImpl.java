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
		try{
			sqlSession=DBTools.getSession(); 
			UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
			boolean state = userMapper.updateUser(user);
			sqlSession.commit();
			return state;
		}catch(Exception e){
			e.printStackTrace();
			sqlSession.rollback();
			return null;
		}finally{
			sqlSession.close();
		}
	}

	@Override
	public User selectUserById(int id) {
		try{
			sqlSession=DBTools.getSession(); 
			UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
			User user = userMapper.selectById(id);
			return user;
		}catch(Exception e){
			e.printStackTrace();
			sqlSession.rollback();
			return null;
		}finally{
			sqlSession.close();
		}
	}

	@Override
	public Boolean addUser(User user) {
		try{
			sqlSession=DBTools.getSession(); 
			UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
			boolean state = userMapper.insertUser(user);
			sqlSession.commit();
			return state;
		}catch(Exception e){
			e.printStackTrace();
			sqlSession.rollback();
			return null;
		}finally{
			sqlSession.close();
		}
	}

	@Override
	public List<User> selectAllUser() {
		List<User> users;
		try{
			sqlSession=DBTools.getSession(); 
			UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
			users = userMapper.selectAll();			
		}catch(Exception e){
			e.printStackTrace();
			sqlSession.rollback();
			return null;
		}finally{
			sqlSession.close();
		}
		return users;
	}
	@Override
	public boolean deleteUser(int id) {
		try{
			sqlSession=DBTools.getSession(); 
			UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
			boolean state = userMapper.deleteById(id);
			sqlSession.commit();
			return state;
		}catch(Exception e){
			e.printStackTrace();
			sqlSession.rollback();
		}finally{
			sqlSession.close();
		}
		return false;
	}
	

}
