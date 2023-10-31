<%@page import="com.trungtamjava.model.Person"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Person Detail</title>
</head>
<body>
	
	<% Person p = (Person) request.getAttribute("person"); %>
	
	<p>ID: <%=p.getId() %></p>
	<p>NAME: <%=p.getName()%></p>

</body>
</html>