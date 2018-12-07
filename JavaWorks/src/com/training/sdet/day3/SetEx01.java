package com.training.sdet.day3;

import java.util.HashSet;
import java.util.Set;

//type safe of string
public class SetEx01 {
	public static void main(String[] args) {
		Set<String> mySet = new HashSet<>();// hashSet is a class implements Set interface 
		
		//mySet.add("Raj");
		//mySet.add("Mesi");
		//mySet.add("Raj");
		//mySet.add("Mesi");
		
		System.out.println(mySet.add("Raj"));
		System.out.println(mySet.add("Mesi"));
		System.out.println(mySet.add("Raj"));
		System.out.println(mySet.add("Mesi"));
		
		System.out.println(mySet.size());
		System.out.println(mySet);
		
	}
}
