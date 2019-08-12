package com.es.eoi.shop.entities;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {

	private List<Article> articles = new ArrayList<Article>();	
	
	public List<Article> getArticles() {
		return articles;
	}

	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}

}
