package com.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
@EnableFeignClients
@SpringBootApplication
public class GetPhoneFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(GetPhoneFeignApplication.class, args);
	}

}
