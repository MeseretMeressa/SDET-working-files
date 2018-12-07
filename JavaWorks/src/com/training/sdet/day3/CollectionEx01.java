package com.training.sdet.day3;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//This program show working of list with raw type
public class CollectionEx01 {
	public static void main(String[] args) {
		List list = new ArrayList();
		
		list.add("hello");
		list.add(32.4);
		list.add(true);
		list.add(new Object());
		
		 System.out.println(list);
		 
		 Iterator  itr = list.iterator();
		 
		 //arrays start from 0
		 //iterators start from -1
		 
		 while (itr.hasNext()){
			 System.out.println(itr.next());
			 
		 }
	}
}
