package com.jwt;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.jwt.entity.UserData;
import com.jwt.repository.UserRepository;

@SpringBootApplication
public class JwtExampleApplication {
	@Autowired
	private UserRepository userRepository;

	@PostConstruct
	public void initUser() {
		List<UserData> users = Stream.of(new UserData(1, "rajaram", "password", "rajaram@gmail.com"),
				new UserData(2, "kalyan", "abhilash", "abhi@gmail.com"),
				new UserData(3, "kalyan", "password", "kalyan@gmail.com")).collect(Collectors.toList());
		userRepository.saveAll(users);
	}

	public static void main(String[] args) {
		SpringApplication.run(JwtExampleApplication.class, args);
	}
	
//	@PostMapping("/verify")
//	public String generateToken(@RequestBody AuthRequest authRequest) {
//		return null;	
//	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}
}
