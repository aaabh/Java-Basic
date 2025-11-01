package com.abhi.passingandreturningobjects;

public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 = Flipkart.createProduct();
		Flipkart.displayProductDetails(p1);
		System.out.println("--------------------------------------------");
		Product p2 = Flipkart.createProduct();
		Flipkart.displayProductDetails(p2);

	}

}
