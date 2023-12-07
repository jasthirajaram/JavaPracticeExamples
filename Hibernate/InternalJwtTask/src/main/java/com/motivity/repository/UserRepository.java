package com.motivity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.motivity.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	@Query(value = "select * from user_tbl where username= :username",nativeQuery = true)
	User findByUserName(String username);

}
