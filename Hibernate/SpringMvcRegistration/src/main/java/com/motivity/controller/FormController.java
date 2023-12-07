package com.motivity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.motivity.model.User;

@Controller
public class FormController {
	
	@ModelAttribute
	public void commonDesc(Model model) {
		System.out.println("Control in modelAttribute");
		model.addAttribute("Header", "Deisgned by Abhilash");
		model.addAttribute("footer", "Please connect in social media");
	}
	
	@RequestMapping(path = "/register", method = RequestMethod.GET)
	public String form() {
		System.out.println("This is Form");
		return "form";
	}

	@RequestMapping(path = "/success", method = RequestMethod.POST)
	public String registered(@ModelAttribute User user, Model model) 
	{

//		model.addAttribute("email", email);
//		model.addAttribute("userName", userName);
//		model.addAttribute("password", password);
		System.out.println(user);
		System.out.println("this is successful registered page");
		return "success";
	}
}
