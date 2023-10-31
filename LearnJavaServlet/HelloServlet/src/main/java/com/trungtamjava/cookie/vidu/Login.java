package com.trungtamjava.cookie.vidu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/login"})
public class Login extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		resp.setContentType("text/html");
		
		PrintWriter pw = resp.getWriter();
		
		pw.println("<form action='/HelloServlet/login' method='post'>");
		pw.println("Username: <input type='text' name='username'>");
		pw.println("Password: <input type='password' name='password'>");
		pw.println("<input type='submit' value='login'>");
		pw.println("</form>");
		
		pw.close();
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		if(username.equals("trungtamjava") && password.equals("12345")) {
			Cookie cookie = new Cookie("username", username);
			cookie.setMaxAge(30);
			resp.addCookie(cookie);
			
			resp.sendRedirect("/HelloServlet/welcome");
		}else {
			resp.sendRedirect("/HelloServlet/login");
		}
	}
}
