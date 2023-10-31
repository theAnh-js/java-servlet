package filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;


@WebFilter(urlPatterns = "/*") //chặn để lọc tất cả các path trên url
public class LogFilter implements Filter {
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		System.out.println("Log Filter"); // chạy qua dòng này trước, rồi mới gọi thằng dưới
		
		chain.doFilter(request, response); // gọi hàm này để cho đi tiếp 
		
//		String key = request.getParameter("key");
//		if(key != null) { // có key thì mới cho đi 
//			chain.doFilter(request, response); // gọi hàm này để cho đi tiếp 
//		}else { // ko thì chặn lại
//			PrintWriter pw = response.getWriter();
//			pw.print("No permission");
//		}
	
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}
	

}
