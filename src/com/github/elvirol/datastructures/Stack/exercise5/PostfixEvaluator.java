package com.github.elvirol.datastructures.Stack.exercise5;

import java.util.Set;
import java.util.Stack;

public class PostfixEvaluator {
	public static void main(String[] args) {
		String test = "2 3 4 + *";
		
		System.out.println(evaluatePostfix(test));
		
	}
	public static int evaluatePostfix(String expression) {
		if(expression == null || expression.isEmpty()) {
			throw new IllegalArgumentException("String cannot be null or empty.");
		}
		
		int left = 0;
		int right = 0;
		
		Stack<Integer> stack = new Stack<>();
		Set<String> symbole = Set.of("+", "-", "/", "*");
		
	
		
		String[] tokens = expression.split(" ");
		
		for(String token: tokens) {
			System.out.println(stack);
			if(symbole.contains(token)) {
				
				right = stack.pop();
				left = stack.pop();
				
				int result = switch(token) {
				case "+" -> left + right;
				case "-" -> left - right;
				case "*" -> left * right;
				case "/" -> left / right;
				default  -> throw new IllegalStateException("Unexpected operator: " + token);
				};
				stack.push(result);
				
			}else {
				stack.push(Integer.parseInt(token));
					
				}
			}
		
		return stack.pop();
}
}