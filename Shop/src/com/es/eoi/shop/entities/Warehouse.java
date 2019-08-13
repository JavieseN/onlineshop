package com.es.eoi.shop.entities;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Warehouse {

	private List<Article> articles = new ArrayList<Article>();	
	
}
