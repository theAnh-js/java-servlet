package jmaster.io.project2.repo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import jmaster.io.project2.entity.User;

public interface UserRepo extends JpaRepository<User, Integer>  {

	@Query("SELECT u FROM User u WHERE u.name LIKE : x")
	Page<User> searchByName(@Param("x") String s, Pageable page);
}
