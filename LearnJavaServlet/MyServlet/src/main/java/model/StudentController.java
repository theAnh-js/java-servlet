package model;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/student/create")
public class StudentController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher rd = req.getRequestDispatcher("/views/create-student.jsp");
		rd.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String id = req.getParameter("id");
		String name = req.getParameter("name");
		String gpa = req.getParameter("gpa");
		
		Student student = new Student(Integer.parseInt(id), name, Double.parseDouble(gpa)
				);
		
		req.setAttribute("student", student);
		
		RequestDispatcher rd = req.getRequestDispatcher("/views/show-student.jsp");
		rd.forward(req, resp);
		
	}

}
