package com.github.elvirol.datastructures.Stack.exercise4;

import java.util.Stack;

public class PalindromeChecker {
	public static void main(String[] args) {
		String test = "radaR";
		System.out.println(isPalindrome(test));
	}
	public static boolean isPalindrome(String input) {
		if(input == null || input.isEmpty()) {
			throw new IllegalArgumentException("String cannot be null or empty.");
		}
		
		
		char[] split = input.toCharArray();
		Stack<Character> stackTest = new Stack<>();
		
		for(char letter: split) {
			stackTest.add(letter);
		}
		
		for(Character letter: split) {
			if(Character.toLowerCase(letter) != Character.toLowerCase(stackTest.pop())) {
				return false;
			}
		}
		
		return true;
		
	}
}
