package com.json.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.json.model.Address;
import com.json.model.Root;
import com.json.model.Value;

@RestController
public class JsonControler {

	@Autowired
	RestTemplate restTemplate;

	@GetMapping("/getall")
	Root[] getData() {
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		HttpEntity<String> httpEntity = new HttpEntity<>(httpHeaders);
		Root[] root = restTemplate
				.exchange("https://jsonplaceholder.typicode.com/users", HttpMethod.GET, httpEntity, Root[].class)
				.getBody();

		// mapping json to list
		List<Root> list = new ArrayList<>();
		for (Root body : root) {
			list.add(body);
		}

		return root;
	}

	@GetMapping("/get/map")
	Map<Integer, Value> changeMap() {
		Root[] data = getData();
		Map<Integer, Value> map = new LinkedHashMap<>();
		for (Root root : data) {
			map.put(root.getId(), settingValue(root));
		}
		return map;
	}

	public Value settingValue(Root root) {
		Value value = new Value();
		value.setName(root.getName());
		value.setUsername(root.getUsername());
		value.setEmail(root.getEmail());
		value.setAddress(root.getAddress());
		value.setCompany(root.getCompany());
		value.setPhone(root.getPhone());
		value.setWebsite(root.getWebsite());
		return value;
	}

	@GetMapping("/get/address")
	Map<Integer, Address> getAddress() {
		Root[] data = getData();
		Map<Integer, Address> map = new LinkedHashMap<>();
		for (Root root : data) {
			map.put(root.getId(), root.getAddress());
		}
		return map;
	}
}
