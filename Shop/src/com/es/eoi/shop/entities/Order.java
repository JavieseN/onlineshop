package com.es.eoi.shop.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Order {
	
	private String id;
	private String date;
	private User user;
	
}
