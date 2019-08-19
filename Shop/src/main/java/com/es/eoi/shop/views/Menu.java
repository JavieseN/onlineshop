package com.es.eoi.shop.views;

import java.sql.SQLException;
import java.util.Scanner;

import com.es.eoi.shop.Main;
import com.es.eoi.shop.entities.Article;
import com.es.eoi.shop.utils.ArticleFactory;

public class Menu {

	@SuppressWarnings("resource")
	public static void printMainMenu() throws SQLException {

		System.out.println("BIENVENIDO A MI TIENDA, INTRODUZCA UNA OPCION");
		System.out.println("1-INSERTAR ARTICULOS");
		System.out.println("2-LISTAR ARTICULOS");
		System.out.println("3-COMPRAR ARTICULOS");

		Scanner scan = new Scanner(System.in);

		int option = scan.nextInt();

		switch (option) {
		case 1:
			printMenuInsertArticle();
			break;
		case 2:
			printArticles();
			break;

		default:
			System.out.println("OPCION NO VÃ�LIDA");
			break;
		}

		printMainMenu();

	}

	private static void printArticles() throws SQLException {
						
		for (Article article : Main.articleManager.listAll()) {
			
			if(article!=null) {
				System.out.println(article);
			}
			
		}
		
		printMainMenu();
		
	}

	private static void printMenuInsertArticle() throws SQLException {

		Article article = null;
		
		System.out.println("INTRODUCE CATEGORIA DEL ARTICULO:");
		System.out.println("1-TEXTIL");
		System.out.println("2-ALIMENTACION");
		System.out.println("3-ELECTRONICA");
		
		@SuppressWarnings("resource")
		Scanner scan= new Scanner(System.in);
		
		int option= scan.nextInt();
		
		switch (option) {
		case 1:
			article=ArticleFactory.getArticle(3);
			article.setName("textil");
			article.setCode("AAAAA");
			article.setPrice(100.0);
			break;
		case 2:
			article=ArticleFactory.getArticle(2);
			article.setName("alimentacion");
			article.setCode("BBBBB");
			article.setPrice(10.0);
			break;
		case 3:
			article=ArticleFactory.getArticle(1);
			article.setName("electronica");
			article.setCode("EEEEE");
			article.setPrice(999.0);
			break;
		default:
			System.out.println("OPCION NO VÃ�LIDA");
			break;
		}
		
		//TODO rellenar el articulo con la informacion necesaria
		
		Main.articleManager.save(article);
		
		printMainMenu();
	}

}
