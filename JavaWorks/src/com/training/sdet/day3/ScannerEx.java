package com.training.sdet.day3;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/**
 * 
 * @author Huser
 *
 */
public class ScannerEx {
	static Map<String, String[]> myMap = new HashMap<>();
	
	static {	
		myMap.put("goodmorning", new String[] {"good morning", "bongur", "endemen"});
		myMap.put("goodmorning", new String[] {"good morning", "bongur", "endemen"});
		myMap.put("goodmorning", new String[] {"good morning", "bongur", "endemen"});
		myMap.put("goodmorning", new String[] {"good morning", "bongur", "endemen"});
			}
	
		public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		while(true) {
			System.out.println("Enter Number");
			int choice = sc.nextInt();
			
			switch(choice){
			
			case 1:
				System.out.println("you choose 1");
				break;
				
				default:
					System.out.println("You choose other value");
					break;
			}		
		}
	}
}
