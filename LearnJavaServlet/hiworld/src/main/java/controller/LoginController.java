package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.getRequestDispatcher("/view/login.jsp").forward(req, resp);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		if(username.equals("admin") && password.equals("12345")) {
			System.out.println("login successful");
			
			// SESSION - lưu dữ liệu tạm thời, có thể set thời gian
			HttpSession session = req.getSession(); 
			System.out.println(session.getId());
			session.setAttribute("loginUser", username);
		
			// redirect - yêu cầu phía client gọi url "/hiworld/admin/welcome"
			resp.sendRedirect("/hiworld/admin/welcome"); //lọc qua thằng adminFilter rồi mới đến thằng servlet welcome
		}else {
			// redirect - yêu cầu client gọi url lại 
			resp.sendRedirect("/hiworld/login");
		}
	}
}
