package com.trungtamjava.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {
	
	public static Connection getJDBCConnection() {
		
		final String url = "jdbc:mysql://localhost:3306/ban_hang";
		final String user = "root";
		final String password = "";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

}
