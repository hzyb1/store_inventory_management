package action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import po.InStockPo;
import serviceImpl.UserServiceImpl;
import model.User;

import com.opensymphony.xwork2.ActionContext;


public class UserAction {
	private String message; 
	private User user = null; //用于装配用户HTTP请求参数
	private User changeUser;
	private ArrayList<User> users;
	private String condition = "";
	int id;
	UserServiceImpl userServiceImpl = new UserServiceImpl();
	private List<InStockPo> inStockList;
	
	public User getChangeUser() {
		return changeUser;
	}
	public void setChangeUser(User changeUser) {
		this.changeUser = changeUser;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
				if(user1.getState() == 0){
					message = "账号被禁用，请联系管理员";
					return "error";
				}
				inStockList = new ArrayList<InStockPo>();
				session.put("inStockList", inStockList);
				session.put("user", user1);
				return "success";
			} else {
				message = "账号或密码不正确";
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
		session.remove("user");
		return "input";
	}
	
	public String addUser() {
		if (userServiceImpl.addUser(user)) {
			message = "添加成功";
			System.out.println(message);
			return "success";
		} else {
			message = "添加用户失败！(该账号或已注册）";
			System.out.println(message);
			return "error";
		}
	}
	
	public String checkAllUser() {
		users = (ArrayList<User>) userServiceImpl.selectAllUser();
		ActionContext.getContext().put("users", users);
		System.out.println(users.size());
		return "success";
	}
	
	public String deleteUser() {
		if (userServiceImpl.deleteUser(id)) {
			message = "删除成功";
			return "success";
		} else {
			return "error";
		}
	}
	
	public String updateUserForm() {
		changeUser = userServiceImpl.selectUserById(id);
		//ActionContext.getContext().put("changeUser", changeUser);
		return "success";
	}
	
	public String updateUser() {
		if (userServiceImpl.updateUser(changeUser)) {
			message = "更新用户成功！";
		} else {
			message = "更新用户失败！";
		}
		return "success";
	}
}
