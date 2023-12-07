package com.feign.utility;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "feign", url = "http://localhost:8081/phones")
public interface PhoneClient {
	
	@DeleteMapping("delete/{id}")
	String deletePhone(@PathVariable int id);
}
