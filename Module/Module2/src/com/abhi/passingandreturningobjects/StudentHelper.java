package com.abhi.passingandreturningobjects;

import java.util.Scanner;

public class StudentHelper {

	static void  displayStudentInfo(Student s) {
		if (s != null) {
			System.out.println("CGPA : "+s.cgpa);
			System.out.println("NAME : "+s.name);
		}
	}
	static Student createStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter CGPA : ");
		double cgpa = sc.nextDouble();
		System.out.println("Enter NAME : ");
		String name = sc.next();
		Student s = new Student(cgpa, name);
		return s;
	}

}
