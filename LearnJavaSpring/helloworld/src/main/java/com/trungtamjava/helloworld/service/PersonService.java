package com.trungtamjava.helloworld.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trungtamjava.helloworld.entity.Person;
import com.trungtamjava.helloworld.repo.PersonRepo;

@Service
public class PersonService {
	
	@Autowired
	PersonRepo personRepo;
	
	public List<Person> getAll(){
		return personRepo.findAll();
	}
}
