package com.github.elvirol.datastructures.ArrayList.exercise2;

import java.util.ArrayList;
import java.util.Arrays;


public class SumEvenNumbers {
	public static void main(String[] args) {
		ArrayList<Integer> test = new ArrayList<>(Arrays.asList(4, 5, 7, 9));
		
		System.out.println(calculateEvenSum(test));
	}
	public static int calculateEvenSum(ArrayList<Integer> arrList) {
		if(arrList == null || arrList.size() == 0) {
			throw new IllegalArgumentException("ArrayList cannot be null or empty.");
		}
		
		int sum = 0;
		
		for(int e: arrList) {
			if(e % 2 == 0) sum += e;
		}
		return sum;
	}
}
