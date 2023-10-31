<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create Person</title>
</head>
<body>
	<form action="/DemoServlet/person/create" method="post">
	 	
	 	<input name="id" placeholder="id..." autofocus="autofocus">
	 	<input name="name" placeholder="name...">
	 	<button name="submit">Save</button>
	</form>

</body>
</html>