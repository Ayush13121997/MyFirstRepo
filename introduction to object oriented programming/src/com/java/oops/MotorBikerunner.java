package com.java.oops;

public class MotorBikerunner {

	public static void main(String[] args) {
 		Motorbike ducati = new Motorbike();
		Motorbike honda =new Motorbike();
		ducati.start();
		honda.start();
		
		ducati.setSpeed(100);
		
		ducati.increaseSpeed(100);
		honda.increaseSpeed(100);
		
		ducati.decreaseSpeed(100);
		honda.decreaseSpeed(100);
		System.out.println(ducati.getSpeed());
		
		//honda.setSpeed(80);
		
		System.out.println(honda.getSpeed());
		
		
	}

}
