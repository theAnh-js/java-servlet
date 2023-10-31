package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Person;

@WebServlet("/person/create")
public class PersonCreateController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher rd = req.getRequestDispatcher("/view/person-create.jsp");
		
		rd.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// đọc dữ liệu của client gửi lên
		String id = req.getParameter("id");
		String name = req.getParameter("name");
		
		System.out.println(id);
		System.out.println(name);
		Person p = new Person();
		p.setId(Integer.parseInt(id));
		p.setName(name);
		
		// save to database jdbc: ..... giống java core
		//....
		
		//forward sang 1 view khác để show thông tin get được.
		req.setAttribute("person", p);
		req.getRequestDispatcher("/view/person-detail.jsp").forward(req, resp);
	
	}
}
