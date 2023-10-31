package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/hi", "/hello"}, loadOnStartup = 1)
public class HiController extends HttpServlet {

	@Override
	public void init() throws ServletException {
		System.out.println("Init Servlet");
	}
	@Override
	public void destroy() {
		System.out.println("Destroy Servlet");
	}
	
	//GET: khi go duong dan
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Http Get Method");
		System.out.println(req.getRemoteAddr());
		
		//response: trả về các nội dung.
		resp.setContentType("text/html");// trả về dạng nội dung
		
		PrintWriter pw = resp.getWriter(); // đối tượng giúp in ra các đoạn text trả về
		pw.println("Hi World");
		pw.println("<h1>Hi Html</h1>");
	}
}
