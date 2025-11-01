package com.abhi.passingandreturningobjects;

import java.util.Scanner;

public class EmployeeHelper {
	static void displayEmployeeDetails(Employee e) {
		if(e != null) {
			System.out.println("EID : "+e.eid);
			System.out.println("CTC : "+e.ctc);
		}
	}
	static Employee createEmployee() {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter eid");
		int eid = sc.nextInt();
		System.out.println("Enter CTC");
		double ctc = sc.nextDouble();
		Employee e = new Employee(eid, ctc);
		return e;
		}
	

}
