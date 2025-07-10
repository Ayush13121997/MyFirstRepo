package com.java.oops;

public class student {

	String name;
	int rollno ;
	public student() {
		// TODO Auto-generated constructor stub
		super();
	}
	

	public student(String name ,int rollno)
	{
	  super();
	  this.name=name;
	  this.rollno=rollno;
	}
	
	public void setname(String name)
	{
		this.name=name;
	}
	public String getname()
	{
		return name;
	}
	
	public void setrollno(int rollno)
	{
		this.rollno=rollno;
	}
	public int getrollno()
	{
		return rollno;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
