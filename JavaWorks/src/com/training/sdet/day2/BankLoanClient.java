package com.training.sdet.day2;

public class BankLoanClient {
	public static void main(String[] args) {
		BankLoan bankLoan = new Personal();
		
		bankLoan.foreClosure(true);
		bankLoan.loanAmount(3000);
		bankLoan.repay(200);
		
		System.out.println("-------------------------------");
		bankLoan = new StudentLoan();
		bankLoan.foreClosure(false);
		bankLoan.loanAmount(3000);
		bankLoan.repay(200);
		
	}
}
