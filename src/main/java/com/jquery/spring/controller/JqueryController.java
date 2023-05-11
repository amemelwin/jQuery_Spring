package com.jquery.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.jquery.spring.service.ItemService;

@Controller
public class JqueryController {
	
	@Autowired
	ItemService itemService;
	
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("items",this.itemService.getItems());
		return "screen/index";
	}
	

}
