package com.es.eoi.shop;

import com.es.eoi.shop.entities.User;
import com.es.eoi.shop.entities.Warehouse;
import com.es.eoi.shop.managers.ArticleManager;
import com.es.eoi.shop.utils.ArticleFactory;
import com.es.eoi.shop.views.Menu;

public class Main {

	public static Warehouse warehouse;
	public static User[] users;
	public static ArticleManager articleManager;

	public static void main(String[] args) {

		initWarehouse();

		Menu.printMainMenu();
	}

	public static void initWarehouse() {
		
		warehouse = new Warehouse(100);
		articleManager= new ArticleManager(warehouse);
		users=new User[10];
		

		for (int i = 0; i < 5; i++) {
			warehouse.getArticles()[i] = ArticleFactory.getArticle("textil");
		}
		for (int i = 5; i < 10; i++) {
			warehouse.getArticles()[i] = ArticleFactory.getArticle("alimentacion");
		}

	}

}
