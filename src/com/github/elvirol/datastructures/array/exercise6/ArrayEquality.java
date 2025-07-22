package com.github.elvirol.datastructures.array.exercise6;

public class ArrayEquality {
	public static void main(String[] args) {
		int[] a = {1, 2, 3};
		int[] b = {1, 2, 3};
		int[] c = {3, 2, 1};
		int[] d = {1, 2};

		System.out.println(areEqual(a, b)); 
		System.out.println(areEqual(a, c)); 
		System.out.println(areEqual(a, d)); 
	}
	public static boolean areEqual(int[] arrA, int[] arrB) {
		if (arrA == arrB) return true; 
	    if (arrA == null || arrB == null) return false;
	    if (arrA.length != arrB.length) return false;
	    
		for(int i = 0; i < arrA.length; i ++) {
			if(arrA[i] != arrB[i]) return false;
		}
		return true;
	}

}
