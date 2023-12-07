package com.oauth.controller;

import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OAuthController {
	
	@GetMapping("/")
	public String home(OAuth2AuthenticationToken oauth) {
		System.out.println(oauth.getPrincipal());
		System.out.println(oauth.getName());
		System.out.println(oauth.getDetails());
		return "<h1>Welcome home</h1>";
	}
}