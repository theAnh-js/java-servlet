package com.trungtamjava.session.vidu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = "/welcome-session")
public class WelcomeSession extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		
		PrintWriter pw = resp.getWriter();
		String name = "";
		
		HttpSession httpSession = req.getSession();
		
		Object obj = httpSession.getAttribute("username");
		
		if(obj != null) {
			name = (String) obj;
		}else {
			resp.sendRedirect("/HelloServlet/session-login");
		}
		
		pw.println("xin chao " + name);
		
		pw.println("<br/> log out <a href='/HelloServlet/logout'>Logout</a>");
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
