package com.ayush.firstjavaproject;

public class MultiplicationTable {
	void print() {
	for(int i=1 ;i<=10;i++) {
		System.out.printf("%d*%d=%d",5,i,5*i).println();
		}
	}
	void print(int n) {
		print(n ,1,10);
		
			}
	void print(int n,int from ,int to) {
		for(int i=from ;i<=to;i++) {
			System.out.printf("%d*%d=%d",n,i,n*i).println();
			}
		}

}
