package com.github.elvirol.datastructures.Stack.exercise2;

import java.util.Stack;

public class DecimalToBinaryConverter {
	public static void main(String[] args) {
		int test = 13;
		System.out.println(decimalToBinary(test));
	}
	
	public static String  decimalToBinary(int number) {
		if(number == 0) {
			return "0";
		}
		
		Stack<Integer> binary = new Stack<>();
		String anser = "";
		
		
		while(number > 0) {
			binary.add(number % 2);
			number /= 2;
		}
		while(!binary.isEmpty()) {
			anser += binary.pop().toString();
		}
		
		return anser;
	}

}
