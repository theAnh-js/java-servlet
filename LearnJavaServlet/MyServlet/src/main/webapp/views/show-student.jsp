<%@page import="model.Student"%>
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
	Object obj = request.getAttribute("student");

	Student student = (Student) obj;

	int id = student.getId();
	String name = student.getName();
	double gpa = student.getGpa();
	%>	
	<h1>Thong tin cua HS</h1>
	<p>id: <%=id %></p> 
	<p>Ten: <%=name %></p>
	<p>Gpa: <%=gpa %></p>

</body>
</html>