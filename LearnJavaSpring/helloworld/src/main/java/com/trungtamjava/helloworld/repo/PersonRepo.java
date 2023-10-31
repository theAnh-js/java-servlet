package com.trungtamjava.helloworld.repo;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.trungtamjava.helloworld.entity.Person;

// PersonRepo sẽ chứa các hàm để gọi đến database
public interface PersonRepo extends JpaRepository<Person, Integer > {
	@Query("SELECT p FROM Person p WHERE p.age >= :min AND p.age <= :max")
	List<Person> search(@Param("min") int min, @Param("max") int max);
	
	
	//tìm các đối tượng theo tên, trả về 1 danh sách,  where name = 
	List<Person> findByName(String name);  // đây là hàm có sẵn cho ta dùng, mặc định là findBy + tên thuộc tính của entity
	
	//Phan trang thì thêm pageable vào -> nó sẽ trả về cho mk pages
	Page<Person> findByName(String name, Pageable page);
	
	@Query("SELECT p FROM Person p WHERE p.age >= :min AND p.age <= :max")
	Page<Person> search(@Param("min") int min, @Param("max") int max, Pageable page);
}
