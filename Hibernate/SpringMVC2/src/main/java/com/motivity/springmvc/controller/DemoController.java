package com.motivity.springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DemoController {

	@RequestMapping("/home")
	public ModelAndView home() {
		System.out.println("This is home url");
		ModelAndView view = new ModelAndView();
		view.addObject("name", "Ballanki Abhilash");
		view.addObject("id", 501);
		view.setViewName("home");
		return view;
	}
	
	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("This is help url");
		ModelAndView andView = new ModelAndView();
		andView.addObject("name", "Abhilash");
		List<String> concepts = new ArrayList<String>();
		concepts.add("Java basic");
		concepts.add("Java core");
		concepts.add("Java advanced");
		concepts.add("Servlets and JSP");
		concepts.add("Spring Framework");
		andView.addObject("courses", concepts);
		andView.setViewName("help");
		return andView;
	}
}
