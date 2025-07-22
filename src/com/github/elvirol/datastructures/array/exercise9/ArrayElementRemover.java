package com.github.elvirol.datastructures.array.exercise9;

import java.util.Arrays;

public class ArrayElementRemover {
	public static void main(String[] args) {
		int[] test = {3, 5, 2, 5, 7};
		
		System.out.println(Arrays.toString(arrElementRemover(test, 5)));
	}
	public static int[] arrElementRemover(int[] arr, int element) {
	    if (arr == null || arr.length == 0) {
	        throw new IllegalArgumentException("Array cannot be null or empty");
	    }

	    int count = 0;

	    for (int i = 0; i < arr.length; i++) {
	        if (arr[i] != element) {
	            arr[count++] = arr[i];
	        }
	    }

	    return Arrays.copyOf(arr, count);
	}
	}


