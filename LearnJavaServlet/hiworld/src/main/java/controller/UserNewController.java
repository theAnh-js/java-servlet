package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.User;
import service.UserService;

@WebServlet(urlPatterns = "/user/new")
public class UserNewController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// form add new user(id, name, age)
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("/view/new-user.jsp");
		
		requestDispatcher.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	
		
		String id = req.getParameter("id");
		String name = req.getParameter("name");
		String age = req.getParameter("age");
		
		User user = new User(Integer.parseInt(id), name, Integer.parseInt(age));
		
		//save to database
		
		UserService userService = new UserService();
		userService.create(user);

		resp.sendRedirect("/hiworld/user/list");
		
		
	}
}
