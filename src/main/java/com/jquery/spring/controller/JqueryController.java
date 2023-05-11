package com.jquery.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JqueryController {
	
	@GetMapping("/")
	public String index() {
		return "screen/index";
	}
	

}
