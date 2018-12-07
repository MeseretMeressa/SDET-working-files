package com.training.sdet.day2;

public class Account  implements Comparable<Account>{
	private int accountId;  // this variables kept in the Hip
	private String name;   //        >>
	private double balance;    ///   >>
	
	private static int count; //this variable kept in the stack
	
	public Account(String name, double balance) {
		super();
		this.accountId =  count ++; 
		this.name = name;
		this.balance = balance;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public int getAccountId() {
		return accountId;
	}
	public String getName() {
		return name;
	}
	public static int getCount() {
		return count;
	}
	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", name=" + name + ", balance=" + balance + "]";
	}
	@Override
	public int compareTo(Account o) {
		// TODO Auto-generated method stub
		//return this.getAccountId() - o.accountId ;
		//return this.getName().compareTo(o.getName()); //ascending order
		return o.getName().compareTo(o.getName()); //sorting based on the name 
	}

	
}
