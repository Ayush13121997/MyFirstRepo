package com.java.oops;

public class AbstractionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		Employee contractor = new Contractor("ayush",500,6);
		Employee fulltimeEmp = new FullTimeEmp("rahul",500);
		System.out.println(contractor.calculateSalary());
		System.out.println(fulltimeEmp.calculateSalary());
		
	}

}
