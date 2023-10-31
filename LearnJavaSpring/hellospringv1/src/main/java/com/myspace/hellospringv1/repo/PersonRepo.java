package com.myspace.hellospringv1.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myspace.hellospringv1.entity.Person;

public interface PersonRepo extends JpaRepository<Person,Integer>  {

}
