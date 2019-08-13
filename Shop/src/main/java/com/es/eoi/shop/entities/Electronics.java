package com.es.eoi.shop.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Electronics extends Article {

	private String power;
	private Double guarantee;
	private static final Double ELECTRONICS_VAT = 1.21;
	
	@Override
	public Double getTotalPrice() {		
		return this.getPrice() * ELECTRONICS_VAT;
	}

	@Override
	public String toString() {
		return "Electronics [power=" + power + ", guarantee=" + guarantee + ", getName()=" + getName() + ", getCode()="
				+ getCode() + ", getPrice()=" + getPrice() + ", getCategory()=" + getCategory() + "]";
	}
	
	

}
