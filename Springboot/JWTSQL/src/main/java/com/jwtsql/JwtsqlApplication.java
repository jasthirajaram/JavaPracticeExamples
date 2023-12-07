package com.jwtsql;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jwtsql.model.UserData;

@SpringBootApplication
public class JwtsqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(JwtsqlApplication.class, args);
	}
	
	publoi void addUsers() {
		List<UserData> users = Stream.of(
				
				new UserData(1088, "rajaram", "rajaram", "rajaram@gmail.com", 25000, null))
				
				)
	}
}
