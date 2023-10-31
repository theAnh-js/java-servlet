package jmaster.io.project2.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import jmaster.io.project2.entity.UserRole;

public interface UserRoleRepo 
       extends JpaRepository<UserRole, Integer> {

	
}
