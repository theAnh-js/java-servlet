<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>xin chao trung tam java</h1>
<%int id = Integer.valueOf(request.getParameter("id")); %>
<p>Id cua ban: <%= id %></p>

<a href="logout.jsp">Log out</a>
</body>
</html>