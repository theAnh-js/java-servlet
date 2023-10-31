package com.trungtamjava.helloworld.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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

import com.trungtamjava.helloworld.entity.Laptop;
import com.trungtamjava.helloworld.entity.Person;
import com.trungtamjava.helloworld.repo.PersonRepo;
import com.trungtamjava.helloworld.service.PersonService;

@Controller
@RequestMapping("/person")
public class PersonController {

	List<Person> list = new ArrayList<Person>();

	@Autowired //
	PersonRepo personRepo;

	@Autowired // giúp ta không cần new đối tượng
	@Qualifier("laptop2") // khi có 2 thằng laptop trùng kiểu thì cần dùng @Qualifier
	Laptop laptop;

	@Autowired
	PersonService personService;

	@GetMapping("/create")
	public String create() {
		System.out.println(laptop.getName());
		return "person/create.html"; // chú ý: KHÔNG có gạch chéo ở đầu.
	}

	@PostMapping("/create")
	public String create(@RequestParam("id") int id, @RequestParam("name") String name, @RequestParam("age") int age) {

		Person person = new Person(id, name, age);

//		list.add(person);

		// save to database
		personRepo.save(person);

		// chuyen huong redirect:
		return "redirect:/person/list";
	}

	@GetMapping("/list")
	public String list(Model model) {

		List<Person> persons = personService.getAll();
//		List<Person> persons = personRepo.findAll();  // trả về 1 list persons
//		model.addAttribute("personList", list);
		model.addAttribute("personList", persons);

		return "person/list.html";
	}

	@GetMapping("/search")
	public String search(@RequestParam("min") int min, @RequestParam("max") int max, 
			@RequestParam("page") int page,
			@RequestParam("size") int size, Model model) {

		Page<Person> pagePerson = personRepo.search(min, max, PageRequest.of(page, size)); //, Sort.by(Sort.Direction.DESC, "age")

		System.out.println("total pages: " + pagePerson.getTotalPages());
		System.out.println("total elements: " + pagePerson.getNumberOfElements());

		model.addAttribute("personList", pagePerson.getContent());
		// getContent() Returns the page content as List.

		return "person/list.html";
	}

	@GetMapping("/delete")
	public String delete(@RequestParam("id") int id) {

		personRepo.deleteById(id);

		return "redirect:/person/list";
	}
	
	
	@GetMapping("/edit/{id}") // thay thì requestparam thì có thể dùng cách này
	public String edit(@PathVariable("id") int id,
						Model model
			) {

		Person p = personRepo.findById(id).orElse(null); // tìm p có id từ database
		model.addAttribute("person", p);
		
		return "person/edit.html";
	}
	
	@PostMapping("/edit")
	public String edit(@ModelAttribute Person person) {
// dùng modelAttribute thì đỡ phải dùng @RequestParam id, name, age
		// save to database
		personRepo.save(person);

		// chuyen huong redirect:
		return "redirect:/person/list";
	}
}
