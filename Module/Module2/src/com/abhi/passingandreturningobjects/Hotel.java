package com.abhi.passingandreturningobjects;

import java.util.Scanner;

public class Hotel {
	static void displayBiriyaniDetails(Biriyani b) {
		
		if(b!= null) {
			System.out.println("Quantity: "+b.qty);
			System.out.println("Price: "+b.price);
			
		}
	}
	static Biriyani createBiriyani() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Quantity: ");
		int qty = sc.nextInt();
		System.out.println("Enter price: ");
		double price = sc.nextDouble();
		Biriyani b =new  Biriyani(qty, price);
		return b;
	}
}
