package com.trungtamjava.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = "/hello-session")
public class Session1 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession httpSession = req.getSession(); //tạo ra 1 đối tượng session mới trên server, nếu có rồi thì đọc lại
		
		httpSession.setAttribute("name", "trung tam java");
		
		httpSession.setAttribute("age", 8);
		
		resp.setContentType("text/html");
		
		PrintWriter pw = resp.getWriter();
		
		pw.println("xin chao - set session");
		
	}
}
