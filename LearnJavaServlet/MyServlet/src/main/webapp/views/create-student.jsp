<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>Input the infomation of student</h1>
	<form action="/MyServlet/student/create" method="post">
		<input name="id" placeholder="nhap id">
		<input name="name" placeholder="nhap ten">
		<input name="gpa" placeholder="nhap gpa">
		
		<button name="submit">Submit</button>
	
	</form>

</body>
</html>