package com.abhi.passingandreturningobjects;

public class MainClass6 {
	public static void main(String[] args) {
		Biriyani b1 = Hotel.createBiriyani();
		Hotel.displayBiriyaniDetails(b1);
		System.out.println("------------------------------");
		Biriyani b2 = Hotel.createBiriyani();
		Hotel.displayBiriyaniDetails(b2);
		
	}

}
