package com.training.sdet.day1;

public class Customer extends Person  {
	private int income;

	public int getIncome() {
		return income;
	}

	public void setIncome(int income) {
		this.income = income;
	}

	@Override
	public String toString() {
		return "Customer [income=" + income + "]" + super.toString();
	}
	
}
