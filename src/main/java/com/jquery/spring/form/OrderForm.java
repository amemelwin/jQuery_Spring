package com.jquery.spring.form;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.Data;

@Data
public class OrderForm {
	private String order;
	
	public List<String> toList() throws JsonMappingException, JsonProcessingException{
		ObjectMapper mapper = new ObjectMapper();
		List<String> orders = mapper.readValue(this.order, new TypeReference<List<String>>(){});
		return orders;
	}
	

}
