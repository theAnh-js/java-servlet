package com.trungtamjava;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/goodbye", "/gb" })
public class GoodbyeController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//		req.getRemoteAddr();
		resp.setContentType("text/html");

		PrintWriter pw = resp.getWriter();

		pw.println("<h1> Trang Chu </h1>");
		pw.println("<ul> <li>San pham</li> <li>Lien he</li> </ul>");

		pw.close();
	}
}
