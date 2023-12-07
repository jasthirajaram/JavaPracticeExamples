package com.webclient.controller;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import com.webclient.model.Books;

import reactor.core.publisher.Mono;
@RestController
public class BookController {
	
	@Autowired
	private WebClient webClient;
	
	@PostMapping("/post")
	public Mono<String> saveBook(@RequestBody Books book) {
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		return webClient.post().uri("http://localhost:8080/books/save").syncBody(book).retrieve().bodyToMono(String.class);
//		return restTemplate
//				.exchange("http://localhost:8080/books/save", HttpMethod.POST, httpEntity, GetBooksData.class)
//				.getBody();
	}
	
	@GetMapping("/getall")
	public Mono<String> getAllBooks() {
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		return webClient.get().uri("http://localhost:8080/books/getall").retrieve().bodyToMono(String.class);
	}
	
	@PutMapping("/update")
	public Mono<String> updateBook(@RequestBody Books book) {
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		return webClient.put().uri("http://localhost:8080/books/update").syncBody(book).retrieve().bodyToMono(String.class);
	}
}
