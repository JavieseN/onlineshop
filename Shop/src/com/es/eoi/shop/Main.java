package com.es.eoi.shop;

import com.es.eoi.shop.entities.Warehouse;
import com.es.eoi.shop.utils.ArticleFactory;
import com.es.eoi.shop.views.Menu;

public class Main {

	public static Warehouse warehouse = new Warehouse(100);

	public static void main(String[] args) {

		initWarehouse();

		Menu.printMainMenu();
	}

	public static void initWarehouse() {

		for (int i = 0; i < 5; i++) {
			warehouse.getArticles()[i] = ArticleFactory.getArticle("textil");
		}
		for (int i = 5; i < 10; i++) {
			warehouse.getArticles()[i] = ArticleFactory.getArticle("alimentacion");
		}

	}

}
