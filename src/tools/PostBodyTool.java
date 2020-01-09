package tools;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.servlet.http.HttpServletRequest;

public class PostBodyTool {
	/**
     * 获取POST请求中Body参数
     * @param request
     * @return 字符串
     */
	 public static String getParm(HttpServletRequest request) {
	        BufferedReader br = null;
	        try {
	            br = new BufferedReader(new InputStreamReader(request.getInputStream(), "UTF-8"));
	        } catch (IOException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	        String line = null;
	        StringBuilder sb = new StringBuilder();
	        try {
	            while ((line = br.readLine()) != null) {
	                sb.append(line);
	            }
	        } catch (IOException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	        return sb.toString();
	    }
}
