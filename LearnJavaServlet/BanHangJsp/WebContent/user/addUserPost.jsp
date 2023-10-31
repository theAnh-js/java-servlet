<%@page import="com.trungtamjava.model.User"%>
<%@page import="com.trungtamjava.service.UserService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	String name = request.getParameter("name");
	String password = request.getParameter("password");
	String phone = request.getParameter("phone");
	String about = request.getParameter("about");
	String username = request.getParameter("username");
	String role = request.getParameter("role");
	
	String[] favs = request.getParameterValues("favourites");
	String fav = "";
	
	for(int i = 0; i < favs.length - 1; i++){
		fav += favs[i] + ",";
	}
	fav += favs[favs.length - 1];
	
	// cách dưới sẽ bị dính dấu phẩy ở cuối.
	//for(String f : favs){
	//	fav += f + ",";
	//}
	
	UserService userService = new UserService();
	User user = new User();
	
	user.setName(name);
	user.setPassword(password);
	user.setPhone(phone);
	user.setAbout(about);
	user.setUsername(username);
	user.setRole(role);
	user.setFavourites(fav);
	
	userService.addUser(user);
	
	response.sendRedirect("/BanHangJsp/user/listUser.jsp");
	
	//    17:42 / 30:19 youtute cho nét
	
	
	//String favouries1 = request.getParameter("favouries1");
	//String favouries2 = request.getParameter("favouries2");
	//String favouries3 = request.getParameter("favouries3");
	
	//String fav = "";
	//if(favouries1 != null){
	//	fav += favouries1 + " - ";
	//}
	//if(favouries2 != null){
	//	fav += favouries2 + " - ";
	//}
	//if(favouries3 != null){
	//	fav += favouries3;
	//}
%>