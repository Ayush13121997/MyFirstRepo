package com.java.oops;

public class Contractor extends Employee {

	private int WorkingHrs;
	public Contractor(String Empname, int paymentPerHrs ,int WorkingHrs) {
		super(Empname, paymentPerHrs);
		this.WorkingHrs=WorkingHrs;
		// TODO Auto-generated constructor stub
	}

	@Override
	public int calculateSalary() {
		// TODO Auto-generated method stub
		int salary = getpaymentPerHrs() * WorkingHrs;
		return salary;
	}

}
