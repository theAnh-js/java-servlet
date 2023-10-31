package com.trungtamjava.practicespring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.trungtamjava.practicespring.entity.Person;
import com.trungtamjava.practicespring.repo.PersonRepo;


@Service
public class PersonService {

	@Autowired
	PersonRepo personRepo;
	
	public List<Person> getList(){
		
		return personRepo.findAll();
	}
}
