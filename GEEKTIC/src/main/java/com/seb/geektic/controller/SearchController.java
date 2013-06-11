package com.seb.geektic.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.seb.geektic.domaines.Geek;
import com.seb.geektic.service.Service;


@Controller
@RequestMapping("/")
public class SearchController {

	@Autowired
	public Service service;
	public String pseudo = "";
	public String sexe = "";
	public String[] interets;
	
	public SearchController(){	
	}
	
	@RequestMapping(value = "advancedSearch", method = RequestMethod.POST)
	public ModelAndView FindPseudoSexeInteret(HttpServletRequest request){
		pseudo = request.getParameter("pseudo");
		sexe = request.getParameter("sexe");
		interets = request.getParameterValues("check");
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("geeks", service.FindByPseudoSexeInterets(pseudo, sexe, interets));
		
		mv.setViewName("detail");
		return mv;
	}
	
	@RequestMapping(value = "addVue", method = RequestMethod.POST)
	public ModelAndView AddVue(HttpServletRequest request) {
		String id = request.getParameter("geekId");
		
		Geek geek = service.FindGeekById(Long.parseLong(id));
		geek.setNbvue(geek.getNbvue()+1);
		
		service.AddVue(geek);
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("geeks", service.FindByPseudoSexeInterets(pseudo, sexe, interets));
		
		mv.setViewName("detail");
		return mv;
	}
}
