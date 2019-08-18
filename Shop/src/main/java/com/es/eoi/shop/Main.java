package com.es.eoi.shop;

import java.sql.SQLException;

import com.es.eoi.shop.managers.ArticleManager;
import com.es.eoi.shop.managers.OrderManager;
import com.es.eoi.shop.managers.UserManager;
import com.es.eoi.shop.views.Menu;

public class Main {

	public static ArticleManager articleManager;
	public static OrderManager orderManager;
	public static UserManager userManager;

	public static void main(String[] args) {

		initWarehouse();

		try {
			Menu.printMainMenu();
		} catch (SQLException e) {		
			e.printStackTrace();
		}

	}

	public static void initWarehouse() {

		articleManager = new ArticleManager();
		userManager = new UserManager();
		orderManager = new OrderManager();

	}

}
