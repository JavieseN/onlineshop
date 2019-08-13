package com.es.eoi.shop.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Textile extends Article {

	private String color;
	private String size;
	private static final Double TEXTILE_VAT = 1.21;
	
	@Override
	public Double getTotalPrice() {	
		return this.getPrice() * TEXTILE_VAT;
	}

	@Override
	public String toString() {
		return "Textile [color=" + color + ", size=" + size + ", getName()=" + getName() + ", getCode()=" + getCode()
				+ ", getPrice()=" + getPrice() + ", getCategory()=" + getCategory() + "]";
	}

	
	
}
