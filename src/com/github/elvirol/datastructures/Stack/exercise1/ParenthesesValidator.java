package com.github.elvirol.datastructures.Stack.exercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class ParenthesesValidator {
	public static void main(String[] args) {
		
		String test = "{[()]}";
		
		System.out.println(isValid(test));
		
	}
	public static boolean isValid(String input) {
		if(input == null || input.length() == 0) {
			throw new IllegalArgumentException("String cannot be null or empty.");
		}
		
		Map<Character, Character> symbole = Map.of(
				'}', '{',
				']', '[',
				')', '('
		);
		
		Stack<Character> check = new Stack<>();
		char[] splitWord = input.toCharArray();
		
		for(char letter: splitWord) {
			if(symbole.containsValue(letter)) {
				check.add(letter);
			}
			
			if(symbole.containsKey(letter)) {
				if(check.isEmpty() || check.pop() != symbole.get(letter)) {
					return false;
				}
			}
		}
		return check.isEmpty();
	}
}
