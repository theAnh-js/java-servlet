<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Add a new user</h1>

<form action="addUserPost.jsp" method="post">

	<input name="name" type="text" placeholder="Ten nguoi dung"><br/>
	<input name="password" type="password" placeholder="Mat khau nguoi dung"><br/>
	<input name="phone" type="text" placeholder="Dien thoai"><br/>
	<input name="username" type="text" placeholder="Ten tai khoan"><br/>
	<textarea rows="3" cols="30" name="about" placeholder="Gioi thieu"></textarea><br/>
	
	<input name="role" type="radio" value="ROLE_ADMIN">ADMIN
	<input name="role" type="radio" value="ROLE_USER">USER<br/>

	<input name="favourites" type="checkbox" value="xem phim"> Xem phim<br/>
	<input name="favourites" type="checkbox" value="nghe nhac"> Nghe nhac<br/>
	<input name="favourites" type="checkbox" value="du lich"> Du lich<br/>
	
	<input type="submit" value="ADD">
</form>

<p><a href="/BanHangJsp/user/listUser.jsp">BACK TO LIST OF USERS</a></p>

</body>
</html>