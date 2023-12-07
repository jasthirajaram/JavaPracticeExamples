package com.feign.utility;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.feign.model.Phones;

@FeignClient(value = "feign", url = "http://localhost:8081/phones")
public interface PhoneClient {
	
	@GetMapping("/getall")
	List<Phones> getAllPhones();
}
