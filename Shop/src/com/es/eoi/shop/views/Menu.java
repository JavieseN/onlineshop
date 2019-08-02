package com.es.eoi.shop.views;

import java.util.Scanner;

public class Menu {

	public static void printMenu() {
		
		System.out.println("BIENVENIDO A MI TIENDA, INTRODUZCA UNA OPCION");
		System.out.println("1-COMPRAR ARTICULOS");
		System.out.println("2-LISTAR ARTICULOS");
		System.out.println("3-GESTIONAR ARTICULOS");
		
		Scanner scan= new Scanner(System.in);
		
		int option= scan.nextInt();
		
		System.out.println("Has elegido la opcion: " + option);
		
		printMenu();

	}

}
