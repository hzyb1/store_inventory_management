package action;

import java.util.ArrayList;
import java.util.Map;

import serviceImpl.UserServiceImpl;
import model.User;

import com.opensymphony.xwork2.ActionContext;


public class UserAction {
	private String message; 
	private User user = null; //用于装配用户HTTP请求参数
	private ArrayList<User> users;
	private String condition = "";
	UserServiceImpl userServiceImpl = new UserServiceImpl();
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public ArrayList<User> getUsers() {
		return users;
	}
	public void setUsers(ArrayList<User> users) {
		this.users = users;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	
	
	public void setUser(User user) {
		this.user = user;
	}
	public User getUser() {
		return this.user;
	}


	//用户登录
	public String login() {
		ActionContext context = ActionContext.getContext();
		Map<String, Object> session = context.getSession();
		if ((User)session.get("user") == null) {
			User user1 = userServiceImpl.login(user.getAccount(), user.getPassword());
			if (user1 != null) {
				session.put("user", user1);
				return "success";
			} else {
				return "error";
			}
		} else {
			return "success";
		}
	}
	//用户注销
	public String logout() {
		ActionContext context = ActionContext.getContext();
		Map<String, Object> session = context.getSession();
		session.remove("usr");
		return "input";
	}
	
	public String add() {
		if (true) {
			return "success";
		} else {
			message = "添加用户失败！";
			return "error";
		}
	}
	
	public String checkAll() {
		users = (ArrayList<User>) userServiceImpl.selectAllUser();
		return "success";
	}
	
	public String delete(int id) {
		if (userServiceImpl.deleteUser(id)) {
			return "success";
		} else {
			return "error";
		}
	}
	
	public String updateForm() {
		return "success";
	}
	
	public String update() {
		if (userServiceImpl.updateUser(user)) {
			message = "更新用户成功！";
		} else {
			message = "更新用户失败！";
		}
		return "success";
	}
}
