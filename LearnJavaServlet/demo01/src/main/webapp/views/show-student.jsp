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
	Student s = (Student) obj;
	int id = s.getId();
	String name = s.getName();
	double gpa = s.getGpa();
	%>
	
	<h1>Infomation of student</h1>
	<p><%=id%></p>
	<p><%=name%></p>
	<p><%=gpa%></p>

</body>
</html>