package com.feign.utility;

import com.feign.model.Phones;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(value = "feign", url = "http://localhost:8081/phones")
public interface PhoneClient {
	@PostMapping("/save")
	public ResponseEntity<Phones> savePhone(@RequestBody Phones phone);
	
	@PutMapping("/update")
	Phones updatePhone(@RequestBody Phones phone);
}
