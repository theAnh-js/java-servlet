<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello Servlet</title>
</head>
<body>
	<h1>Hello Java Servlet</h1>
	<p>Servlet is here</p>
	
	<%
	String ip = request.getRemoteAddr();
	int x = 10;

	Object obj = request.getAttribute("msg");
	String s = (String) obj; // đa hình, ép kiểu
	%>
	
	<%=ip%>
	<!-- show giá trị của biến thì thêm = -->
	<%=x%>
	<%=s%>
</body>
</html>