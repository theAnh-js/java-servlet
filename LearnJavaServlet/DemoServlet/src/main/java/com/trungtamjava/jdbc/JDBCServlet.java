package com.trungtamjava.jdbc;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/jdbc")
public class JDBCServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		PrintWriter pw = resp.getWriter();
		
		Connection connection = JDBCConnection.getJDBCConnection();
		
		try {
			Statement statement = connection.createStatement();
			String sql = "SELECT * FROM PERSON";
			ResultSet resultSet = statement.executeQuery(sql);
			
			while(resultSet.next()) {
				pw.println(resultSet.getInt("id") + " : ");
				pw.println(resultSet.getString("name"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
