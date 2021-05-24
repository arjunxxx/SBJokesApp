package com.technolearns.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.technolearns.services.JokesService;

@Controller
public class JokesController {
	
	@Autowired
	private final JokesService jokesService;
	
	
	
	public JokesController(JokesService jokesService) {
		super();
		this.jokesService = jokesService;
	}



	@RequestMapping("/joke")
	public String gtRandomJokes(Model model) {
		String randomJoke = jokesService.getRandomJoke();
		model.addAttribute("joke", randomJoke);
		return "index";
		
	}

}
