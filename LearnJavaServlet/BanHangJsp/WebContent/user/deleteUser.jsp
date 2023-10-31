<%@page import="com.trungtamjava.service.UserService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	int id = Integer.valueOf(request.getParameter("id"));
	UserService userService = new UserService();
	userService.deleteUser(id);
	
	response.sendRedirect("/BanHangJsp/user/listUser.jsp");
%>