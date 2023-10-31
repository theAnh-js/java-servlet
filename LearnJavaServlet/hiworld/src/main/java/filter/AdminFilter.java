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
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@WebFilter(urlPatterns = "/admin/*")
public class AdminFilter implements Filter {
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		HttpServletRequest req = (HttpServletRequest) request;
		HttpSession session = req.getSession(); // // có jsessionid rồi thì lấy ra, không có thì tạo mới 
		// nếu ta cố tình xóa value của jsessionid ở phía cookies thì
		// kể cả đăng nhập lại bằng loginUser đúng thì cũng thành No permission
		// vì thằng session này được tạo sessinId mới rồi.
		// khônng còn là thằng session mà ta setAttribute ở phía loginController nữa.
		
		Object key = session.getAttribute("loginUser"); // chú ý ép kiểu 
		
		if(key != null && String.valueOf(key).equals("admin")) { // có key thì mới cho đi 
			chain.doFilter(request, response); // gọi hàm này để cho đi tiếp 
		}else { // ko thì chặn lại
			PrintWriter pw = response.getWriter();
			pw.print("No permission");
		}
		
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
