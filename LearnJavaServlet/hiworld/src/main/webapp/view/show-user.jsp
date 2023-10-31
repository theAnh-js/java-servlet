<%@page import="java.util.List"%>
<%@page import="dto.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Show Users</title>
</head>
<body>
	<% 
		List<User> users = (List<User>)request.getAttribute("userList");
		
	%>
	<table>
		<thead>	
			<tr>
			 	<th>Id</th>
			 	<th>Name</th>
			 	<th>Age</th>
			</tr>
		</thead>
		<tbody>
		<% for(User user : users){%>
			<tr>
				<td><%= user.getId() %></td>
				<td><%= user.getName() %></td>
				<td><%= user.getAge() %></td>	
				<td><an href="/hiworld/user/edit?id=<%=user.getId() %>">Edit</a></td>
			</tr>
		<% } %>
		</tbody>
	</table>

</body>
</html>