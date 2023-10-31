package com.trungtamjava;

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
		req.getRequestDispatcher("/views/login.jsp").forward(req, resp);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		if(username.equals("admin") && password.equals("123")) {
			
			//SESSION -  lưu tạm vào session
			HttpSession session = req.getSession();
			System.out.println(session.getId());
			session.setAttribute("loginUser", username);
			
			// check username, password -> ok -> cho login
			resp.sendRedirect("/DemoServlet/admin/welcome");
		}else {
			// redirect yeu cau client goi lai url 
			resp.sendRedirect("/DemoServlet/login");
		}	
	}
}
