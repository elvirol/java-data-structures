package com.github.elvirol.datastructures.array.exercise8;

import java.util.Arrays;

public class SortedArrayMerger {
	public static void main(String[] args) {
		int[] a = {1, 3, 5};
		int[] b = {2, 4, 6};
				
		System.out.println(Arrays.toString(mergeSortedArrays(a, b)));
		
	}
	public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
		if (arr1 == null || arr2 == null) {
		    throw new IllegalArgumentException("Input arrays must not be null.");
		}
		
		int[] fusion = new int[arr1.length + arr2.length];
		int i = 0; 
		int j = 0;
		int k = 0; 

		while (i < arr1.length && j < arr2.length) {
		    if (arr1[i] <= arr2[j]) {
		        fusion[k++] = arr1[i++];
		    } else {
		        fusion[k++] = arr2[j++];
		    }
		}

		while (i < arr1.length) {
		    fusion[k++] = arr1[i++];
		}
		while (j < arr2.length) {
		    fusion[k++] = arr2[j++];
		}
		return fusion;
	}

}
