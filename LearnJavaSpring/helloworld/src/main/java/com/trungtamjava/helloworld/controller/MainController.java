package com.trungtamjava.helloworld.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
	//cách 1
//	@RequestMapping(value="/", method = RequestMethod.GET) 
	
	// cách 2
	@GetMapping(value="/")
	
	public String home(HttpServletRequest request) {
		
		request.setAttribute("msg", "Hello Spring Boot");
		return "index";
		
	}
}
