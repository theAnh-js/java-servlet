package com.trungtamjava.practicespring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.trungtamjava.practicespring.entity.Person;
import com.trungtamjava.practicespring.repo.PersonRepo;
import com.trungtamjava.practicespring.service.PersonService;

@Controller
@RequestMapping("/practice")
public class PersonController {

	@Autowired
	PersonRepo personRepo;
	
	@Autowired
	PersonService personService;
	
	@GetMapping("/create")
	public String create() {
		return "person/create.html";      // thằng này giống như thằng forward trong Servlet
										  // chuyển sang 1 tài nguyên khác.
	}
	
	@PostMapping("/create")
	public String create(
			@RequestParam("id") int id,
			@RequestParam("name") String name,
			@RequestParam("age") int age			
			) {
		
		Person person = new Person(id, name, age);
		personRepo.save(person);

		return "redirect:/practice/list";   //chuyển hướng trên url nên dùng redirect
	}
	
	@GetMapping("/list")
	public String list(Model model) {
		
		List<Person> list = personService.getList();
		
		model.addAttribute("persons", list);
		
		return "person/list.html";
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam("id") int id) {
		
		personRepo.deleteById(id);
		
		return "redirect:/practice/list";
	}
	
	@GetMapping("/search")
	public String search(@RequestParam("min") int min,
						 @RequestParam("max") int max,
						 @RequestParam("page") int page,
						 @RequestParam("size") int size,
						 Model model
			) {
		
		Page<Person> personPage = personRepo.search(min, max, PageRequest.of(page, size));
		
		model.addAttribute("persons", personPage);
		
		return "person/list.html";
	}
	
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") int id, Model model) {
		
		Person person = personRepo.findById(id).orElse(null);
		model.addAttribute("person", person);
		
		return "person/edit.html";
	}
	
	@PostMapping("/edit")
	public String edit(@ModelAttribute Person p) {
		
		personRepo.save(p);
		
		return "redirect:/practice/list";
		
	}

}
