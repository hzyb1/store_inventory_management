package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Order;
import model.User;
import tools.PostBodyTool;
import tools.ServletTool;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class UpdataUser extends HttpServlet{
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
		response.setContentType("text/json");	
        response.setCharacterEncoding("UTF-8");		//���ñ����ʽ
        PrintWriter out = response.getWriter();		//���
        out.println("safasf");
        out.flush();		//ˢ�»���
        out.close(); 		//�ر���
	}
}
