package com.training.sdet.day3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapEx01 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new  HashMap<String, Integer>();
		
		map.put("Harry", 4000);
		map.put("Kaan", 5500);
		map.put("Desta", 87000);
		
		//System.out.println("Harry balance is " +map.get("Harry"));
		//System.out.println("Desta balance is " +map.get("Desta"));
				
		//
		Set set = map.entrySet();
		Iterator itr = set.iterator();
		
		while(itr.hasNext()){
			Map.Entry element = (Entry) itr.next();
			
			System.out.println(element.getKey() + "," + element.getValue());
			
		}
				
	}

}
