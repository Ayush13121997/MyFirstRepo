package com.java.oops;

public class FullTimeEmp extends Employee {

	public FullTimeEmp(String Empname, int paymentPerHrs) {
		super(Empname, paymentPerHrs);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int calculateSalary() {
		// TODO Auto-generated method stub
		int salary = getpaymentPerHrs()*8;
		return salary;
	}

}
