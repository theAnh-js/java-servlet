<%@page import="com.trungtamjava.model.User"%>
<%@page import="java.util.List"%>
<%@page import="com.trungtamjava.service.UserService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Edit User</h1>

<%
	int id = Integer.valueOf(request.getParameter("id"));
	UserService userService = new UserService();
	User user = userService.getUserById(id);
%>
<form action="editUserPost.jsp" method="post">
	
	<input name="id" type="hidden" placeholder="Id" value="<%= id %>"><br/>
	
	<input name="name" type="text" placeholder="Ten nguoi dung" value="<%= user.getName() %>" ><br/>
	<input name="password" type="password" placeholder="Mat khau nguoi dung" value="<%= user.getPassword() %>"><br/>
	<input name="phone" type="text" placeholder="Dien thoai" value="<%= user.getPhone() %>"><br/>
	<input name="username" type="text" placeholder="Ten tai khoan" value="<%= user.getUsername() %>"><br/>
	<textarea rows="3" cols="30" name="about" placeholder="Gioi thieu" ><%= user.getAbout() %></textarea><br/>
	
	<%if(user.getRole() != null) {%>
		<% if(user.getRole().equals("ROLE_ADMIN")){ %>
		<input name="role" type="radio" value="ROLE_ADMIN" checked="checked">ADMIN
		<input name="role" type="radio" value="ROLE_USER">USER<br/>
		<% } else{%>
		<input name="role" type="radio" value="ROLE_ADMIN">ADMIN
		<input name="role" type="radio" value="ROLE_USER" checked="checked">USER<br/>
		<%} %>
	<%}else{ %>
		<input name="role" type="radio" value="ROLE_ADMIN">ADMIN
		<input name="role" type="radio" value="ROLE_USER">USER<br/>
	<%} %>
	
	
	<%if(user.getFavourites() != null) {%>
		<% if(user.getFavourites().equals("xem phim")){ %>
		<input name="favourites" type="checkbox" value="xem phim" checked="checked"> Xem phim<br/>
		<input name="favourites" type="checkbox" value="nghe nhac"> Nghe nhac<br/>
		<input name="favourites" type="checkbox" value="du lich"> Du lich<br/>
		<% } else if(user.getFavourites().equals("nghe nhac")){%>
		<input name="favourites" type="checkbox" value="xem phim"> Xem phim<br/>
		<input name="favourites" type="checkbox" value="nghe nhac" checked="checked"> Nghe nhac<br/>
		<input name="favourites" type="checkbox" value="du lich"> Du lich<br/>
		<%} else if(user.getFavourites().equals("du lich")){%>
		<input name="favourites" type="checkbox" value="xem phim"> Xem phim<br/>
		<input name="favourites" type="checkbox" value="nghe nhac"> Nghe nhac<br/>
		<input name="favourites" type="checkbox" value="du lich" checked="checked"> Du lich<br/>
		<%}else if(user.getFavourites().equals("xem phim,nghe nhac")){ %>
		<input name="favourites" type="checkbox" value="xem phim" checked="checked"> Xem phim<br/>
		<input name="favourites" type="checkbox" value="nghe nhac" checked="checked"> Nghe nhac<br/>
		<input name="favourites" type="checkbox" value="du lich"> Du lich<br/>
		<%}else if(user.getFavourites().equals("xem phim,du lich")){ %>
		<input name="favourites" type="checkbox" value="xem phim" checked="checked"> Xem phim<br/>
		<input name="favourites" type="checkbox" value="nghe nhac"> Nghe nhac<br/>
		<input name="favourites" type="checkbox" value="du lich" checked="checked"> Du lich<br/>
		<%}else if(user.getFavourites().equals("nghe nhac,du lich")){  %>
		<input name="favourites" type="checkbox" value="xem phim"> Xem phim<br/>
		<input name="favourites" type="checkbox" value="nghe nhac" checked="checked"> Nghe nhac<br/>
		<input name="favourites" type="checkbox" value="du lich" checked="checked"> Du lich<br/>
		<%}else{ %>
		<input name="favourites" type="checkbox" value="xem phim" checked="checked"> Xem phim<br/>
		<input name="favourites" type="checkbox" value="nghe nhac" checked="checked"> Nghe nhac<br/>
		<input name="favourites" type="checkbox" value="du lich" checked="checked"> Du lich<br/>
		<%} %>
	<%}else{ %>
		<input name="favourites" type="checkbox" value="xem phim"> Xem phim<br/>
		<input name="favourites" type="checkbox" value="nghe nhac"> Nghe nhac<br/>
		<input name="favourites" type="checkbox" value="du lich"> Du lich<br/>
	<%} %>
	
	<input type="submit" value="UPDATE">
</form>


</body>
</html>