package com.motivity;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.motivity.model.User;
import com.motivity.repository.UserRepository;

@SpringBootApplication
public class InternalJwtTaskApplication {

	@Autowired
	private UserRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(InternalJwtTaskApplication.class, args);
	}

	@PostConstruct
	public void saveUsers() {
		List<User> list = Stream.of(
				new User(1, "Abhilash", "abhilash"),
				new User(2, "Kailash", "kailash")
				).collect(Collectors.toList());
		repository.saveAll(list);
	}
}
