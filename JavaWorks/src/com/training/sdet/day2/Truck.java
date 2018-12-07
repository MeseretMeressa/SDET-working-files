package com.training.sdet.day2;

public class Truck extends Vehicle{
	
	private int noOfPounds;
	
	public Truck (int noOfPounds, int speed){
		super(speed);
		this.noOfPounds = noOfPounds;
	}
	public void load(){
		System.out.println("Truch has" + noOfPounds + "load");
	}

}
