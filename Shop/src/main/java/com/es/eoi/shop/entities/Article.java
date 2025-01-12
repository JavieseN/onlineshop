package com.es.eoi.shop.entities;

import com.es.eoi.shop.interfaces.Prizable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Article implements Prizable {

	private String name;
	private String code;
	private Double price=0.0;
	private String vat;
	private Integer stock;
	private String category;
	
}
