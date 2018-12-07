package com.training.sdet.day2;

public abstract class Loan {
	private int loanAmount;
	public Loan(int loanAmount){
		this.loanAmount = loanAmount;
	}
	
	// getting from db
	public String getName(){
		return "peter";
	} 
	public String getAddress(){
		return " American Dreamway";
	}
	// access specifiers 
	//public private protected default
	
	public abstract double getROI();
		//---
	
}
