package com.java.oops;

public abstract class Employee {
	
	String Empname;
	int paymentPerHrs;

	public Employee(String Empname,int paymentPerHrs) {
		
		// TODO Auto-generated constructor stub
     this.Empname=Empname;	
     this.paymentPerHrs=paymentPerHrs;
	}
    
	public abstract int calculateSalary();
	
	public void setname(String Empname)
	{
		this.Empname=Empname;
	}
	public String getEmpname()
	{
		return Empname;
	}
	
	public void setpaymentPerHrs(int paymentPerHrs)
	{
		this.paymentPerHrs=paymentPerHrs;
	}
	public int getpaymentPerHrs()
	{
		return paymentPerHrs;
	}
}
