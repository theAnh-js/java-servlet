package com.trungtamjava.session.vidu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = "/session-login")
public class SessionLogin extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		
		PrintWriter pw = resp.getWriter();
		
		pw.println("<form action='/HelloServlet/welcome-session' method='post'>");
		pw.println("username: <input type='text' name='username'>");
		pw.println("password: <input type='password' name='password'>");
		pw.println("<input type='submit' value='login'>");
		pw.println("</form>");
	}
	
//	@Override
//	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		String username = req.getParameter("username");
//		String password = req.getParameter("password");
//		
//		if(username.equals("theanh") && password.equals("12345")) {
//			HttpSession httpSession = req.getSession();
//			
//			httpSession.setAttribute("username", username);
//			resp.sendRedirect("/HelloServlet/welcome-session");
//		}else {
//			resp.sendRedirect("/HelloServlet/session-login");
//		}
//	}
}
