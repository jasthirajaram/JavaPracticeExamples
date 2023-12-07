package com.motivity.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/dashboard")
public class HomeController {
	@RequestMapping("/home")
	public String home() {
		System.out.println("this is home");
		return "index";
	}
	
	@RequestMapping("/about")
	public String about(Model model) {
		System.out.println("this is about");
		model.addAttribute("name", "Abhilash");
		return "about";
	}
	
	@RequestMapping("login")
	public String login(Model model) {
		System.out.println("This is login");
		List<String> list = new ArrayList<String>();
		list.add("Abhilash");
		list.add("Manish");
		model.addAttribute("names", list);
		return "login";
	}
}
