package com.trungtamjava;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DemoServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		
		PrintWriter printWriter = resp.getWriter();
		
		printWriter.println("<h2> Xin Chao Servlet</h2>");
		
		printWriter.println("<p> Servlet is beautiful</p> ");
		
		printWriter.println("<h1> Trang Chu </h1>");
		printWriter.println("<ul> <li>San pham</li> <li>Lien he</li> </ul>");

		
		printWriter.close();
	}
}
