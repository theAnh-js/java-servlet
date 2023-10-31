package com.trungtamjava.model;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/person/create")
public class PersonCreateController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		RequestDispatcher rdpc = req.getRequestDispatcher("/views/person-create.jsp");
		
		rdpc.forward(req, resp);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, 
			HttpServletResponse resp) throws ServletException, IOException {
		
		// đọc dữ liệu được input gửi lên từ client
		String id = req.getParameter("id");
		String name = req.getParameter("name");
		
		System.out.println(id + " " + name);
		
		Person p = new Person();
		p.setId(Integer.parseInt(id));
		p.setName(name);
		// save to database
		//....
		
		// đẩy qua views show ra
		req.setAttribute("person", p);
		
		req.getRequestDispatcher("/views/person-detail.jsp")
		.forward(req, resp);
		
		
	}
	

}
