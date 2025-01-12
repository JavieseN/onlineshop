package com.es.eoi.shop;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.es.eoi.shop.entities.Order;
import com.es.eoi.shop.entities.User;
import com.es.eoi.shop.entities.Warehouse;
import com.es.eoi.shop.managers.ArticleManager;
import com.es.eoi.shop.managers.OrderManager;
import com.es.eoi.shop.managers.UserManager;
import com.es.eoi.shop.views.Menu;

public class Main {

	public static Warehouse warehouse;
	public static List<User> users;
	public static List<Order> orders;
	public static ArticleManager articleManager;
	public static OrderManager orderManager;
	public static UserManager userManager;

	public static void main(String[] args) {

		initWarehouse();

		Menu.printMainMenu();

	}

	public static void initWarehouse() {

		try {
			warehouse = new Warehouse();
		} catch (IOException e) {			
			e.printStackTrace();
		}
		users = new ArrayList<User>();
		orders = new ArrayList<Order>();

		articleManager = new ArticleManager(warehouse);
		userManager = new UserManager(users);
		orderManager = new OrderManager(orders);

	}

}
