package com.training.sdet.day1;
// ctrl + shift + f 
public class Account {
	//get injected 
	private int accID;
	private double accBal;
	//private String accHoldername;
	private Name name;
	//create some methods which is accessable from other class
		//default / protected/public 
	
	public Name getName() {
		return name;
	}
	public void setName(Name name) {
		this.name = name;
	}
	//If if your class has default constructor private variables and  public getter and setter the class called java bean 
	public int getAccID() {
		return accID;
	}
	public void setAccID(int accID) {
		
		this.accID = accID;
	}
	public double getAccBal() {
		return accBal;
	}
	public void setAccBal(double accBal) {
		if (accBal < 10)
			System.out.println("This balance is too low");
			else 
		this.accBal = accBal;
	}
	/*
	public String getAccHoldername() {
		return accHoldername;
	}
	public void setAccHoldername(String accHoldername) {
		this.accHoldername = accHoldername;
	}
	*/
	
	@Override
	public String toString() {
		return "Account [accID=" + accID + ", accBal=" + accBal + ", name=" + name + "]";
	}
	
	/*public String toString(){
		return this.getAccID() + "," + this.getAccBal() + "," + this.name;
	}*/
	
	}
