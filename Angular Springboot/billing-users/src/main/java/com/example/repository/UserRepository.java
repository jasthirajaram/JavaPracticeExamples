package com.example.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
//	@Query(value = "SELECT * FROM users WHERE user_name='rajaram'", nativeQuery = true)
//    User findByUsername(String userName);
	
	@Query(value = "SELECT * FROM users WHERE user_name = :username", nativeQuery = true)
    Optional<User> findByUsername(@Param("username") String username);
}
