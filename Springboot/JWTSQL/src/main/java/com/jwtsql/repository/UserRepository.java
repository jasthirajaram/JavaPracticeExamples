package com.jwtsql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jwtsql.model.UserData;

public interface UserRepository extends JpaRepository<UserData, Integer>{
	
}