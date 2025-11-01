package com.abhi.passingandreturningobjects;

import java.util.Scanner;

public class Flipkart {
	static void displayProductDetails(Product p) {
		if(p!= null) {
			System.out.println("Product ID : "+p.pid);
			System.out.println("Price : "+p.price);
			System.out.println("Rating : "+p.rating);
		}
	}
	
	static Product createProduct() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Product id");
		int pid = sc.nextInt();
		System.out.println("Enter Price");
		double price = sc.nextDouble();
		System.out.println("Enter Rating");
		double rating = sc.nextDouble();
		
		Product p = new Product(pid, price, rating);
		return p;
	}

}
