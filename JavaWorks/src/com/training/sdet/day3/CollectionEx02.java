package com.training.sdet.day3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//This program show working of list with type safe 

public class CollectionEx02 {
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("Harry");
		list.add("Mesi");
		list.add("Kaan");
		list.add("Desta");
		
		//for (String temp : list){
		//				System.out.println(temp);
		//}   this is for developing but better to use while 
		
		/*Iterator<String> itr = list.iterator();
			
			 while (itr.hasNext()){
				 System.out.println(itr.next());
				 
		}*/
		System.out.println(list);
		System.out.println("Size " + list.size());
		
		list.remove("Harry");
		
		System.out.println(list);
		System.out.println("Size " + list.size());
		
		System.out.println(list.contains("Kiflom"));
		
		List<String> subList = list.subList(2, list.size());
		
		System.out.println("sublist -> " + subList);
		
	}

}
