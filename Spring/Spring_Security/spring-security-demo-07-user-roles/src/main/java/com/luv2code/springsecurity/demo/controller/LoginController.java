package com.luv2code.springsecurity.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

	@GetMapping("/showMyLoginPage")
	public String showMyLoginPage() {
		
		return "fancy-login";
		
	}
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
>>>>>>> master
	
	
	// add request mapping for /access-denied
	
	@GetMapping("/access-denied")
	public String showAccessDenied() {
		
		return "access-denied";
		
	}
	
	
<<<<<<< HEAD
=======
>>>>>>> fb5d52c9c1fea16ee95f536da79ca6f6f1325c0c
>>>>>>> master
}
