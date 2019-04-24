package com.luv2code.springsecurity.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

	
	@GetMapping("/")
	public String showHome()
	{
		return "home";
	}
	
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
>>>>>>> master
	// add request mapping for /leaders"
	
	@GetMapping("/leaders")
	public String showLeadres()
	{
		return "leaders";
	}
		
	// add request mapping for /systems
	@GetMapping("/systems")
	public String showSystems()
	{
		return "systems";
	}
		
<<<<<<< HEAD
=======
>>>>>>> fb5d52c9c1fea16ee95f536da79ca6f6f1325c0c
>>>>>>> master
}
