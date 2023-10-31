<%@page import="model.Person"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Person detail</title>
</head>
<body>
	<% 
		Object obj = request.getAttribute("person");
		Person p = (Person)obj;
	%>
	<h3><%= p.getId() %></h3>
	<h3><%= p.getName() %></h3>

</body>
</html>