package com.github.elvirol.datastructures.array.exercise10;

import java.util.Arrays;

public class ArrayDoubleNumber {
	public static void main(String[] args) {
		int[] test = {1, 2, 3, 4, 5, 6};
		
		System.out.println(Arrays.toString(doubleEvenNumber(test)));
		
	}
	public static int[] doubleEvenNumber(int[] arr) {
		if(arr == null){
			throw new IllegalArgumentException("Array cannot be null or empty");
		}
		
		int[] result = Arrays.stream(arr).filter(n -> n % 2 == 0).map(n -> n * 2).toArray();
		
		return result;
	}
}
