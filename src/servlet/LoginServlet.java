package servlet;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;

import com.google.gson.Gson;

import serviceImpl.UserServiceImpl;
import tools.DBTools;
import tools.ServletTool;
import mapper.UserMapper;
import model.User;


public class LoginServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {

        response.setContentType("text/json");	
        response.setCharacterEncoding("UTF-8");		//设置编码格式
        PrintWriter out = response.getWriter();		//输出 dian
        //取出URL中的账号密码参数
        String telephone = request.getParameter("telephone");
        String password = request.getParameter("password");
        System.out.println(telephone+","+password);
//        UserServiceImpl userServiceImpl = new UserServiceImpl();
//        //验证过程
//		User user = userServiceImpl.login(telephone, password);
//		if(user != null){
//			out.println(new Gson().toJson(user));		//将user转为josn字串，输出给客户端
//		}else{
//			out.println(ServletTool.HTTPERROR);
//		}
        out.flush();		//刷新缓存
        out.close(); 		//关闭流
	    }
	    public void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	    
	    }
}
