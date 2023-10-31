package trungtamjava.cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/servlet1"})
public class Servlet1 extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		
		PrintWriter pw = resp.getWriter();
		pw.println("Xin Chao Java Servlet1");
		
		Cookie cookie = new Cookie("name", "Trung tam java");
		cookie.setMaxAge(5);
		
		resp.addCookie(cookie);
		
		Cookie cookie2 = new Cookie("age", "28");
		cookie2.setMaxAge(10);
		
		resp.addCookie(cookie2);
		
		pw.println("Xin Chao Java Servlet11111");
	}
}
