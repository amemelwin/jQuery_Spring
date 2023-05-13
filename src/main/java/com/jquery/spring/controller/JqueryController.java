package com.jquery.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.jquery.spring.form.OrderForm;
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
	
	@PostMapping("/order/create")
	public String createOrder(@ModelAttribute OrderForm orderForm ) {
		try {
			List<String> orderList = orderForm.toList();
			System.out.println(orderList);			
		}catch(Exception e) {
			
		}		
		return "redirect:/";		
	}
	
	
	@GetMapping("/lesson2")
	public String lessonTwo() {
		return "screen/lesson2";
	}
	

}
