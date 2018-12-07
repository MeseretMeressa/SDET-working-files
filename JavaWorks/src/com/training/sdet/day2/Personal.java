package com.training.sdet.day2;

public class Personal implements BankLoan{

	@Override
	public void loanAmount(int amount) {
		// TODO Auto-generated method stub
		System.out.println("Personal loan applied for" + amount);
	}

	@Override
	public void repay(int repayAmount) {
		// TODO Auto-generated method stub
		System.out.println("Personal loan applied for" + repayAmount);
	}

	@Override
	public void foreClosure(boolean flag) {
		// TODO Auto-generated method stub
		
	System.out.println("There shall be 2% fore closure");
	}
}
