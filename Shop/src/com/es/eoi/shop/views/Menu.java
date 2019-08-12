package com.es.eoi.shop.views;

import java.util.Scanner;

import com.es.eoi.shop.Main;
import com.es.eoi.shop.entities.Article;
import com.es.eoi.shop.utils.ArticleFactory;

public class Menu {

	@SuppressWarnings("resource")
	public static void printMainMenu() {

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
			System.out.println("OPCION NO VÁLIDA");
			break;
		}

		printMainMenu();

	}

	private static void printArticles() {
						
		for (Article article : Main.articleManager.listAll()) {
			
			if(article!=null) {
				System.out.println(article);
			}
			
		}
		
		printMainMenu();
		
	}

	private static void printMenuInsertArticle() {

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
			article=ArticleFactory.getArticle("textil");
			article.setName("textil"+(Main.warehouse.getArticles().size()+1));
			break;
		case 2:
			article=ArticleFactory.getArticle("alimentacion");
			article.setName("alimentacion"+(Main.warehouse.getArticles().size()+1));
			break;
		case 3:
			article=ArticleFactory.getArticle("electronica");
			article.setName("electronica"+(Main.warehouse.getArticles().size()+1));
			break;
		default:
			System.out.println("OPCION NO VÁLIDA");
			break;
		}
		
		//TODO rellenar el articulo con la informacion necesaria
		
		Main.articleManager.save(article);
		
		printMainMenu();
	}

}
