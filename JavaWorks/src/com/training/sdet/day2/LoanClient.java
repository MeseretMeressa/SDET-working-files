package com.training.sdet.day2;

public class LoanClient {
	public static void main(String[] args) {
		Loan loan = new HomeLoan(1000);
		showloan(loan);
		
		loan = new VehicleLoan(2000);
		showloan(loan);
		
		loan = new MorgageLoan(400);
		showloan(loan);
	}

	private static void showloan(Loan loan) {
		System.out.println("Name: " + loan.getName());
		System.out.println("Address: " + loan.getAddress());
		System.out.println("RIO: " + loan.getROI());
	}
}
