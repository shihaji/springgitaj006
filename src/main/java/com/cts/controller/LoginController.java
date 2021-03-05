package com.cts.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
	
	@GetMapping("index")
	public String login() {
		
		return "index";
	}
	
	@PostMapping("register")
	public String register() {
		
		return "register";
	}

}
