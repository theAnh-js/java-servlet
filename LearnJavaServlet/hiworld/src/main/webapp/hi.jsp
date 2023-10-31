<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hi Servlet</title>
</head>
<body>
	<h1>Hello Java Servlet JSP!!!</h1>
	<%
		String ip = request.getRemoteAddr();
		int x = 10;
		Object obj = request.getAttribute("msg");
		String s = (String) obj;//  đa hình: ép kiểu
	%>
	<%=ip %>
	<p><%= x %></p>
	<h2><%= s %></h2>
	
</body>
</html>