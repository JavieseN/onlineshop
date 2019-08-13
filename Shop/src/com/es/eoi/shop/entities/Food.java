package com.es.eoi.shop.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Food extends Article {

	private String expirationDate;
	private String allergens;
	private static final Double FOOD_VAT = 1.10;
	
	@Override
	public Double getTotalPrice() {		
		return this.getPrice() * FOOD_VAT;
	}

}
