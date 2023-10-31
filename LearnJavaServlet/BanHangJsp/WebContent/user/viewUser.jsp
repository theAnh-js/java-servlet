<%@page import="com.trungtamjava.model.User"%>
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

<% 
	int id = Integer.valueOf(request.getParameter("id"));
	UserService userService = new UserService();
	User user = userService.getUserById(id);

	//String name = request.getParameter("name");
	//String password = request.getParameter("password");
	//String phone = request.getParameter("phone");
	//String about = request.getParameter("about");
	//String favouries1 = request.getParameter("favouries1");
	//String favouries2 = request.getParameter("favouries2");
	//String favouries3 = request.getParameter("favouries3");
	
	//String fav = "";
	//if(favouries1 != null){
	//	fav += favouries1 + " - ";
	//}
	//if(favouries2 != null){
	//	fav += favouries2 + " - ";
	//}
	//if(favouries3 != null){
	//	fav += favouries3;
	//}
%>
<table>
	<tr>
		<td>Id</td>
		<td><%=user.getId() %></td>
	</tr>
	<tr>
		<td>Ten</td>
		<td><%=user.getName() %></td>
	</tr>
	<tr>
		<td>Tai khoan</td>
		<td><%=user.getUsername() %></td>
	</tr>
	<tr>
		<td>Vai tro</td>
		<td><%= user.getRole() %></td>
	</tr>
	<tr>
		<td>Dien thoai</td>
		<td><%=user.getPhone()%></td>
	</tr>
	<tr>
		<td>Gioi thieu</td>
		<td><%=user.getAbout() %></td>
	</tr>
	<tr>
		<td>So thich</td>
		<td><%=user.getFavourites() %></td>
	</tr>

</table>

<p><a href="/BanHangJsp/user/listUser.jsp">BACK TO LIST OF USERS</a></p>

</body>
</html>