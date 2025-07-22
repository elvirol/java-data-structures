package com.github.elvirol.datastructures.Stack.exercise6;

import java.util.Stack;

public class AdjacentDuplicateRemover {
	public static void main(String[] args) {
		String test = "abbaca";
		
		System.out.println(adjacentDuplicateRemove(test));
		
	}
	public static String adjacentDuplicateRemove(String paragraphe){
		if(paragraphe == null || paragraphe.length() == 0) {
			throw new IllegalArgumentException("String cannot be null or empty.");
		}
		
		String[] tokens = paragraphe.split("");
		Stack<String> stack = new Stack<>();
		StringBuilder result = new StringBuilder();
		
		for(String token: tokens) {
			System.out.println(token);
			System.out.println(stack);
			if(stack.isEmpty()) {
				stack.add(token);
				System.out.println(stack);
			}else if(!stack.peek().equals(token)) {
				stack.add(token);
			}else {
				stack.pop();
			}
		}
		
	    while (!stack.isEmpty()) {
	        result.insert(0, stack.pop());
	    }
	    
	    return result.toString();
	}
}
