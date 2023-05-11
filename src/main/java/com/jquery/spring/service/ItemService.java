package com.jquery.spring.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;

import com.jquery.spring.entity.Item;

@Controller
public class ItemService {
	public List<Item> getItems(){		
		return generateList(10);		
	}
	
	private List<Item> generateList(int length){
		List<Item> items = new ArrayList<Item>();
		for(int i=1; i<=length; i++) {
			Item item = new Item();
			item.setId(i);
			item.setTitle("This is product Id "+i);
			item.setPrice((int)(Math.random()*101*250));
			item.setImgUrl("https://loremflickr.com/320/240?random=1");		
			
			items.add(item);
		}
		return items;
	}

}
