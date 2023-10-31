package com.trungtamjava.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/form-nguoi-dung"})
public class FormPerson extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		
		PrintWriter pw = resp.getWriter();
		pw.println("<form action='/DemoServlet/them-nguoi-dung' method='post'>");
		
		pw.println("ten: <input type='text' name = 'ten'>");
		pw.println("tuoi: <input type='text' name = 'tuoi'>");
		pw.println("dia chi: <input type='text' name = 'diachi'>");
		
		pw.println("<input type='submit' name = 'ten' value='Submit'>");
		pw.println(" </form>");
	}
}
