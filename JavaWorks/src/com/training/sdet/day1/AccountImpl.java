package com.training.sdet.day1;

public class AccountImpl {
	public static void main(String[] args) {
		Account harryAcount;
		harryAcount = new Account ();
				 
		//or we can write those two lines above this way 
		//Account harryAccount = new Account();
		
		/*
		harryAcount.accID = 101;
		harryAcount.accBal= 3000;
		harryAcount.accHoldername = "Harry Peter";
		
		System.out.println("Acc ID " + harryAcount.accID);
		System.out.println("Acc Holder Name " + harryAcount.accHoldername);
		System.out.println("Acc Balance" + " " + harryAcount.accBal);
		*/
		
		harryAcount.setAccID(101);
		harryAcount.setAccBal(0); 
		//harryAcount.setAccHoldername( "Harry Peter");
		Name name = new Name();
		name.setFirstName("harry");
		name.setLasName("petter");
		harryAcount.setName(name);
	
		
		//System.out.println("Acc ID " + harryAcount.getAccID());
		//System.out.println("Acc Holder Name " + harryAcount.getAccHoldername());
		//System.out.println("First Name " + harryAcount.getName().getFirstName());
		//System.out.println("Last Name " + harryAcount.getName().getLasName());
		//System.out.println("Acc Balance" + " " + harryAcount.getAccBal());
		
		System.out.println(harryAcount.toString());
	}

}
