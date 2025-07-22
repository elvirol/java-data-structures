package com.github.elvirol.datastructures.Stack.exercise3;

import java.util.Stack;

public class ReverserString {
	public static void main(String[] args) {
		String test = "hello";
		
		System.out.println(reverseString(test));
		
	}
	public static String reverseString(String paragraphe) {
		if(paragraphe == null || paragraphe.isBlank()) {
			throw new IllegalArgumentException("String cannot be null or empty.");
		}
		
		Stack<Character> letter = new Stack<>();
		String anser = "";
		
		for(int i = 0; i < paragraphe.length(); i++) {
			letter.add(paragraphe.charAt(i));
		}
		
		while(!letter.isEmpty()) {
			anser += letter.pop();
		}
		
		return anser;
	}

}
