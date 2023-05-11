package com.jquery.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.jquery.spring.service.ItemService;

@Controller
public class JqueryController {
	
	@Autowired
	ItemService itemService;
	
	@GetMapping("/")
	public String index() {
		System.out.println(this.itemService.getItems());
		return "screen/index";
	}
	

}
