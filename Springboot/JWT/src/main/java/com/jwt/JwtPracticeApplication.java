package com.jwt;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jwt.model.User;
import com.jwt.repository.UserRepository;

@SpringBootApplication
public class JwtPracticeApplication {

	@Autowired
	UserRepository repository;
	
	@PostConstruct
	public void saveAllUser() {
		List<User> list = Stream.of(
				new User(1,"Rajaram","rajaram"),
				new User(2,"Abhilash","abhilash"),
				new User(3,"Kalyan","kalyan")
				).collect(Collectors.toList());
		repository.saveAll(list);
	}
	public static void main(String[] args) {
		SpringApplication.run(JwtPracticeApplication.class, args);
	}
}