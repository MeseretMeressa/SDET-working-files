package com.training.sdet.day3;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

	public class SetEx03Try {
		public static void main(String[] args) {
			TreeSet<Emp> ts = new TreeSet<>();
		
			ts.add(new Emp(103, "Mesi", 3334));
			ts.add(new Emp(102, "Kaan", 3332));
			ts.add(new Emp(104, "Desta", 3333));
			ts.add(new Emp(109, "Kiflom", 3335));
			ts.add(new Emp(108, "Seble", 3336));
		
		for (Emp temp : ts){
			//System.out.println(temp);
			System.out.println(temp + " " + temp.hashCode());
			
			//equal method will check if there are duplicates 
	
		}}
}
