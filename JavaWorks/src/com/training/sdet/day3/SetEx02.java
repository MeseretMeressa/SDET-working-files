package com.training.sdet.day3;

import java.util.HashSet;
import java.util.Set;

public class SetEx02 {
	public static void main(String[] args) {
		Set<Emp> set = new HashSet<>();
		
		set.add(new Emp(101, "Mesi", 3334));
		set.add(new Emp(102, "Kaan", 3332));
		set.add(new Emp(103, "Desta", 3333));
		set.add(new Emp(104, "Kiflom", 3335));
		set.add(new Emp(105, "Seble", 3336));
		set.add(new Emp(105, "Seble", 3336));
		set.add(new Emp(105, "Seble", 3336));
		set.add(new Emp(105, "Seble", 3336));
		
		for (Emp temp : set){
			//System.out.println(temp);
			System.out.println(temp + " " + temp.hashCode());
			
			//equal method will check if there are duplicates 
	
		}
	}
}
