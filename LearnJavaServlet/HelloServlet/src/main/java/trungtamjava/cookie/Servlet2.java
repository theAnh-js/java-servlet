package trungtamjava.cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/servlet2")
public class Servlet2 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		
		PrintWriter pw = resp.getWriter();
		
		Cookie[] cookies = req.getCookies();
		
		for(Cookie c : cookies) {
			pw.println(c.getName() + " : " + c.getValue() + "<hr/>");
		}
	}
}
