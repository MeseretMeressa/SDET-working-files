package com.training.sdet.day3;

import java.util.Vector;

public class CollectionEx03 {
	public static void main(String[] args) {
		//Vector<String> vector = new Vector<>();// gives u capacity 10 by default 
		Vector<String> vector = new Vector<>(5,7); //if u want to define the capacity 
		
		System.out.println("Size " + vector.size());
		System.out.println("Capacity " + vector.capacity());
		
		vector.add("one");
		vector.add("two");
		vector.add("three");
		vector.add("four");
		vector.add("five");
		
		vector.add("one");
		vector.add("two");
		vector.add("three");
		vector.add("four");
		vector.add("five");
		
		vector.add("one");
		
		System.out.println("Size " + vector.size());
		System.out.println("Capacity " + vector.capacity());
	}

}
