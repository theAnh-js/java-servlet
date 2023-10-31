<%@page import="com.trungtamjava.service.UserService"%>
<%@page import="com.trungtamjava.model.User"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>List of Users</h1>

<%
	UserService userService = new UserService();
	List<User> users = userService.getAllUsers();
%>
<table>
	<tr>
		<th>ID</th>
		<th>Ten</th>
		<th>Tai khoan</th>
		<th>Chon</th>
	</tr>
	
	<%
		for(User user : users){
			%>
			<tr>
				<td><%=user.getId() %></td>
				<td><%=user.getName() %></td>
				<td><%=user.getUsername() %></td>
				<td><a href="editUser.jsp?id=<%=user.getId()%>">Edit</a> | <a href="deleteUser.jsp?id=<%=user.getId()%>">Delete</a>| <a href="viewUser.jsp?id=<%=user.getId()%>">Detail</a></td>
			</tr>
			
			<%
		}
	%>
</table>

<p><a href="/BanHangJsp/user/addUser.jsp">ADD USER</a></p>

</body>
</html>