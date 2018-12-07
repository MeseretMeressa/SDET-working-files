package com.training.sdet.day3;

import java.util.ArrayDeque;
import java.util.Deque;

public class CollectionEx04 {
	
	public static void main(String[] args) {
		
		Deque<Integer> stack = new ArrayDeque<Integer>();
		
		stack.push(12);
		stack.push(6);
		stack.push(8);
		stack.push(3);
		stack.push(22);
				
		stack.pop();
		
		System.out.println(stack);
		
		
	}

}
