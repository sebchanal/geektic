package com.seb.geektic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.seb.geektic.domaines.Geek;


@Controller
@RequestMapping("/")
public class MainController {

	public MainController(){
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView home(){
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("Geek", new Geek());
		mv.setViewName("home");
		
		return mv;
	}
}
