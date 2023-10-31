package com.trungtamjava.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter(urlPatterns = "/*") // chặn tất cả
// Trước khi vào thằng servlet thì phải chạy qua thằng filter này trước
// filter không phải đích đến mà nó là bộ lọc trước khi request đến tài nguyên
public class LogFilter implements Filter {

	@Override
	public void destroy() {

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		System.out.println("Log Filter");

//		String key = request.getParameter("key");
//		if (key != null) {
//			chain.doFilter(request, response); // gọi hàm này để cho đi qua
//			// ko có chain.doFilter thì nghĩa là ko cho đi qua.
//		}else {
//			PrintWriter pw = response.getWriter();
//			pw.println("No Permission");
//		}
		
		chain.doFilter(request, response);

	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

}
