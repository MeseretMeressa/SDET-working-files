package com.training.sdet.day2;

import java.util.Arrays;
//import java.util.Comparator;

public class AccountClient {
	
	public static void main(String[] args) {
		Account [] accs = new Account[5];
		
		accs [0] = new Account("Frank", 500);
		accs [1] = new Account("Mesi", 2570);
		accs [2] = new Account("Kaan", 150);
		accs [3] = new Account("Desta", 9500);
		accs [4] = new Account("Helen", 6500);
		
		Arrays.sort(accs);
		for(Account temp : accs){
			System.out.println(temp);
		}
		
		//Comparator<Account> comparebasedOnBalance = new Comparator<Account>();
		
		//in java 8 way with lambda expressions this is very short way to sort
		Arrays.sort(accs, (o1,o2)->(int) (o1.getBalance() - o2.getBalance()));
	}

}


//Code from Maveen

/*
 package com.training.sdet.day2;

import java.util.Arrays;
import java.util.Comparator;

public class AccountClient {
	public static void main(String[] args) {
		Account [] accs = new Account[5];

		accs[0] = new Account("Frank", 5000);
		accs[1] = new Account("Brain", 4567);
		accs[2] = new Account("Peter", 5432);
		accs[3] = new Account("Britt", 2233);
		accs[4] = new Account("Becky", 3456);
		
		Arrays.sort(accs);
		
		for(Account temp : accs) {
			System.out.println(temp);
		}
		
		Comparator<Account> compareBasedOnBalance = 
				 new Comparator<Account>() {

			@Override
			public int compare(Account o1, Account o2) {
				return (int) (o1.getBalance() - o2.getBalance()); 
			}
			
		}; 

		Arrays.sort(accs,compareBasedOnBalance); 
		
		Arrays.sort(accs, new Comparator<Account>() {

			public int compare(Account o1, Account o2) {
				return (int) (o1.getBalance() - o2.getBalance()); 
			}
			
		}); 
		
		// in java 8 way with lambda expressions 
		Arrays.sort(accs, (o1, o2 ) -> (int) (o1.getBalance()- o2.getBalance()));
		
		
		System.out.println("Sorting based on balance ");
		for(Account temp : accs) {
			System.out.println(temp);
		}
		
	}
}
 */
