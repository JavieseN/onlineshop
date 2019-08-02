package com.es.eoi.shop;

import com.es.eoi.shop.entities.Article;
import com.es.eoi.shop.entities.Order;
import com.es.eoi.shop.entities.User;
import com.es.eoi.shop.entities.Warehouse;
import com.es.eoi.shop.managers.ArticleManager;
import com.es.eoi.shop.managers.OrderManager;
import com.es.eoi.shop.managers.UserManager;
import com.es.eoi.shop.utils.ArticleFactory;
import com.es.eoi.shop.views.Menu;

public class Main {

	public static Warehouse warehouse;
	public static User[] users;
	public static Order[] orders;
	public static ArticleManager articleManager;
	public static OrderManager orderManager;
	public static UserManager userManager;

	public static void main(String[] args) {

		initWarehouse();

		Menu.printMainMenu();
	}

	public static void initWarehouse() {
			
		warehouse = new Warehouse(100);
		users=new User[10];
		orders=new Order[100];		
		
		articleManager= new ArticleManager(warehouse);
		userManager= new UserManager(users);
		orderManager= new OrderManager(orders);
		
		//init data
		for (int i = 0; i < 5; i++) {
			Article article=ArticleFactory.getArticle("textil");
			article.setCode(String.valueOf(i));
			warehouse.getArticles()[i] = article;
		}
		for (int i = 5; i < 10; i++) {
			Article article=ArticleFactory.getArticle("alimentacion");
			article.setCode(String.valueOf(i));
			warehouse.getArticles()[i] =article;
		}

	}

}
