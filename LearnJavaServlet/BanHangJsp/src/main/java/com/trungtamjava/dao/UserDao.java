package com.trungtamjava.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.trungtamjava.model.User;

public class UserDao {
	
	public List<User> getAllUsers(){
		List<User> users = new ArrayList<User>();
		
		Connection connection = JDBCConnection.getJDBCConnection();
		
		String sql = "SELECT * FROM USER";
		
		try {
			PreparedStatement prepareStatement = connection.prepareStatement(sql);
			ResultSet rs = prepareStatement.executeQuery();
			
			while(rs.next()) {
				
				User user = new User();
				
				user.setId(rs.getInt("ID"));
				user.setName(rs.getString("NAME"));
				user.setUsername(rs.getString("USERNAME"));
				user.setPassword(rs.getString("PASSWORD"));
				user.setPhone(rs.getString("PHONE"));
				user.setAbout(rs.getString("ABOUT"));
				user.setRole(rs.getString("ROLE"));
				user.setFavourites(rs.getString("FAVOURITES"));
				
				users.add(user);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return users;
	}

	public User getUserById(int id) {
		
		Connection connection = JDBCConnection.getJDBCConnection();
		
		String sql = "SELECT * FROM USER WHERE ID = ?";
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			ResultSet rs = preparedStatement.executeQuery();
			while(rs.next()) {
				User user = new User();
				
				user.setId(rs.getInt("ID"));
				user.setName(rs.getString("NAME"));
				user.setUsername(rs.getString("USERNAME"));
				user.setPassword(rs.getString("PASSWORD"));
				user.setPhone(rs.getString("PHONE"));
				user.setAbout(rs.getString("ABOUT"));
				user.setRole(rs.getString("ROLE"));
				user.setFavourites(rs.getString("FAVOURITES"));
				
				return user;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	public void addUser(User user) {
		Connection connection = JDBCConnection.getJDBCConnection();
		
		String sql = "INSERT INTO USER(NAME, PHONE, USERNAME, PASSWORD, ABOUT, FAVOURITES, ROLE) VALUE(?, ?, ?, ?, ?, ?, ?)";
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, user.getName());
			preparedStatement.setString(2, user.getPhone());
			preparedStatement.setString(3, user.getUsername());
			preparedStatement.setString(4, user.getPassword());
			preparedStatement.setString(5, user.getAbout());
			preparedStatement.setString(6, user.getFavourites());
			preparedStatement.setString(7, user.getRole());
			
			int rs = preparedStatement.executeUpdate();
			System.out.println(rs);
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void updatedUser(User user) {
		Connection connection = JDBCConnection.getJDBCConnection();
		String sql = "UPDATE USER SET NAME=?, PHONE=?, USERNAME=?, PASSWORD=?, ABOUT=?, FAVOURITES=?, ROLE=? WHERE ID=?" ;
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, user.getName());
			preparedStatement.setString(2, user.getPhone());
			preparedStatement.setString(3, user.getUsername());
			preparedStatement.setString(4, user.getPassword());
			preparedStatement.setString(5, user.getAbout());
			preparedStatement.setString(6, user.getFavourites());
			preparedStatement.setString(7, user.getRole());
			preparedStatement.setInt(8, user.getId());
			
			int rs = preparedStatement.executeUpdate();
			System.out.println(rs);
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void deleteUser(int id) {
		Connection connection = JDBCConnection.getJDBCConnection();
		String sql = "DELETE FROM USER WHERE ID = ?";
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			
			int rs = preparedStatement.executeUpdate();
			System.out.println(rs);
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
