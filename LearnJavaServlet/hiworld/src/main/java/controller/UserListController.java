package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.User;
import service.UserService;

@WebServlet(urlPatterns = "/user/list")
public class UserListController extends HttpServlet {
	
	UserService userService = new UserService();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<User> users = userService.getAll();
		
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("/view/show-user.jsp");
		
		// set attribute vào req
		req.setAttribute("userList", users);
				
		requestDispatcher.forward(req, resp);
	}
}
