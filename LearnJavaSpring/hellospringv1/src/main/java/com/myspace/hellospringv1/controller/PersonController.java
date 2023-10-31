package com.myspace.hellospringv1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.myspace.hellospringv1.entity.Person;
import com.myspace.hellospringv1.repo.PersonRepo;
import com.myspace.hellospringv1.service.PersonService;

@Controller
@RequestMapping("/myspace")
public class PersonController {
	
	@Autowired
	PersonRepo personRepo;
	
	@Autowired
	PersonService personService;

	@GetMapping("/create")
	public String create() {
		return "personfolder/create.html";
	}
	
	@PostMapping("/get_info")
	public String get_info(
			@RequestParam("id") int id,
			@RequestParam("name") String name,
			@RequestParam("age") int age	
			) {
		
		Person person = new Person(id, name, age);
		
		personRepo.save(person);
		
		return "redirect:/myspace/list";
	}
	@GetMapping("/list")
	public String list(Model model) {
		
		List<Person> persons = personService.getAll();
		
		model.addAttribute("personList", persons);
		
		return "personfolder/show.html";
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam("id") int id) {
		
		personRepo.deleteById(id);
		
		return "redirect:/myspace/list";
	}
	
}
