package com.trungtamjava.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter(urlPatterns = "/welcome-session")
public class AuthenFilter implements Filter {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		// ServletRequest và ServletResponse là cha của
		// HttpServletRequest và HttpServletResponse
		// nên ta có thể ép kiểu xuống được
		// ta phải ép về http để lấy thông tin từ form
		
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;
		
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		HttpSession httpSession = req.getSession();
		
		Object obj = httpSession.getAttribute("username");
		
		if(obj != null) {
			chain.doFilter(request, response);
		}else {
			if(username != null && password != null && username.equals("theanh") && password.equals("12345")) {
				
				
				httpSession.setAttribute("username", username);
				
//				resp.sendRedirect("/HelloServlet/welcome-session");
				chain.doFilter(request, response);
				
			}else {
				resp.sendRedirect("/HelloServlet/session-login");
			}
		}	
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
