package com.myspace.hellospringv1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myspace.hellospringv1.entity.Person;
import com.myspace.hellospringv1.repo.PersonRepo;

@Service
public class PersonService {
	
	@Autowired
	PersonRepo personRepo;
	
	public List<Person> getAll(){
		return personRepo.findAll();
	}

}
