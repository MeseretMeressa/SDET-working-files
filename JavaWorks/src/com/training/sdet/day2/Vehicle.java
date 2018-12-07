package com.training.sdet.day2;

public class Vehicle {
	private int speed;

	public Vehicle(int speed) {
		this.speed = speed;
	}

	public void move() {

		System.out.println("Vehicle is moving " + speed);
	}

	public void Break() {
		System.out.println("Vehicle is stopping");

	}
	protected int getSpeed(){
		return speed;
	}
}
