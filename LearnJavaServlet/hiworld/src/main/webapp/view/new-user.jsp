<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New User</title>
</head>
<body>

	<form action="/hiworld/user/new" method="post">
		<div>
			<label>Id:</label>
			<input type="number" name="id"/>
		</div>
		<div>
			<label>Name:</label>
			<input type="text" name="name"/>
		</div>
		<div>
			<label>Age:</label>
			<input type="number" name="age"/>
		</div>
		<div>
			<button type="submit">Save</button>
		</div>
	</form>

</body>
</html>