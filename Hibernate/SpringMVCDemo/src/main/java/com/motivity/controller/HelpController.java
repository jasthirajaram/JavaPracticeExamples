package com.motivity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/assist")
public class HelpController {
	@RequestMapping("/help")
	public ModelAndView service() {
		ModelAndView view = new ModelAndView();
		view.addObject("name", "Abhilash");
		view.addObject("id", "MLI1083");
		view.setViewName("help");
		return view;
	}
}
