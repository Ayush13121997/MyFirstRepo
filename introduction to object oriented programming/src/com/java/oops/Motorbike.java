package com.java.oops;

public class Motorbike {
	//state
	private int speed;//member variable
	

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if(speed>0)
		this.speed = speed;
	}

	public void increaseSpeed(int howMuch) {
		setSpeed(this.speed+howMuch);
	}
	public void decreaseSpeed(int howMuch) {
		setSpeed(this.speed-howMuch);
	}
	
	void start() {
		System.out.println("Bike Started");
	}

}
