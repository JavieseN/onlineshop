package com.es.eoi.shop.entities;

import com.es.eoi.shop.interfaces.Prizable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Article implements Prizable {

	private int id;
	private String name;
	private String code;
	private Integer stock;
	private double price;
	private ArticleCategory category;

}
