package com.trungtamjava.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.trungtamjava.helloworld.entity.Person;

@Controller
//@RestController

//@RequestMapping("/admin") nếu thêm thế này thì url phải ra
//http://localhost:8080/admin/hello-spring

// Còn ko thì chỉ cần http://localhost:8080/hello-spring
public class HelloController {

	@GetMapping("/hello-spring")
//	@RequestMapping(value="/hello-spring", method = RequestMethod.GET)
	
	public String hello(Model model) {
		model.addAttribute("msg", "Hello Spring Framework");
		model.addAttribute("myKey", "Value is here");
		return "hi.html "; // view
		
		
	}
}
