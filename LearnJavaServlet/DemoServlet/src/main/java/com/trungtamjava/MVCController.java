package com.trungtamjava;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/mvc")
public class MVCController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// MVC: 
		// servlet => vai trò như controller
		// jsp => vai trò như view
		RequestDispatcher dpc = req.getRequestDispatcher("/hello.jsp");
		
		req.setAttribute("msg", "Hello Java Servlet - msg");
		
		dpc.forward(req, resp); // dùng forward để chuyển tiếp.
		
	}
	
}
