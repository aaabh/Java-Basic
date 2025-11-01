package com.abhi.passingandreturningobjects;

public class MainClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = EmployeeHelper.createEmployee();
		EmployeeHelper.displayEmployeeDetails(e1);
		System.out.println("---------------------------------------");
		Employee e2 = EmployeeHelper.createEmployee();
		EmployeeHelper.displayEmployeeDetails(e2);
	}

}
