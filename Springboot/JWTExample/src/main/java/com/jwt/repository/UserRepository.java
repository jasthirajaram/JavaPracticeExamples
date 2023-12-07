package com.jwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.jwt.entity.UserData;

@Repository
public interface UserRepository extends JpaRepository<UserData, Integer>{
	
	UserData findByUsername(String username);
}