package com.es.eoi.shop;

import com.es.eoi.shop.entities.Article;
import com.es.eoi.shop.entities.Food;
import com.es.eoi.shop.entities.Warehouse;
import com.es.eoi.shop.utils.ArticleFactory;
import com.es.eoi.shop.views.Menu;

public class Main {
	
	public static Warehouse warehouse=new Warehouse(100);
	
	public static void main(String[] args) {
		
		Menu.printMenu();
//		
//		Article article= new Article();
//		article.getTotalPrice();
//		
//		Article article2= new Food();
//		article2.getTotalPrice();
//		
//		Article article3=ArticleFactory.getArticle("textil");
//		article3.getTotalPrice();

	}

}
