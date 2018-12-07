package com.training.sdet.day2;

public class Car extends Vehicle {
	private int doors;
	private int capacity;

	public Car(int doors, int capacity, int Speed) {
		super(Speed);
		this.doors = doors;
		this.capacity = capacity;

	}

	public void doors() {
		System.out.println("My car is has " + doors + " doors");
	}

	public void fuelCapacity() {
		System.out.println(" My car fuel capacity is " + capacity);
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		//super.move();
		  
	 System.out.println(" My car is moving at speed" + this.getSpeed());
	}

	@Override
	public void Break() {
		// TODO Auto-generated method stub
		//super.Break();
		 System.out.println(" My car applies break");
	}
	
}
