package com.jquery.spring.entity;

import lombok.Data;

@Data
public class Item {
	private int id;
	private String title;
	private int price;
	private String imgUrl;
}
