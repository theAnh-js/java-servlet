<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
	<form action="/DemoServlet/login" method="post">

		<input name="username" placeholder="username" autofocus="autofocus"> 
		<input name="password" type="password" placeholder="password">
		<button name="submit">Login</button>
		
	</form>

</body>
</html>