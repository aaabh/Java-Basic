package com.abhi.passingandreturningobjects;

import java.util.Scanner;

public class StudentUtility {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter true/false");
		boolean isloop = sc.nextBoolean();
		while(isloop) {
			Student s1 = StudentHelper.createStudent();
			StudentHelper.displayStudentInfo(s1);
			System.out.println("------------------------------------------");
			Student s2 = StudentHelper.createStudent();
			StudentHelper.displayStudentInfo(s2);
			}
	}

}
