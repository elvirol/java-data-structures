package com.github.elvirol.datastructures.array.exercise2;

public class ArrayMinMax {
	public static void main(String[] args) {
		int[] array = {6, 3, 9, 1, 7};
		
		System.out.println(findMin(array));
		System.out.println(findMax(array));
	}
	public static int findMin(int[] array) {
		if (array == null || array.length == 0) {
		    throw new IllegalArgumentException("Le tableau est vide ou null");
		}
		int min = array[0];
		for(int i = 1; i < array.length; i++) {
			if(array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}
	
	public static int findMax(int[] array) {
		if(array == null || array.length == 0) {
			throw new IllegalArgumentException("Le tableau est vide ou null");
		}
		int max = array[0];
		for(int i = 1; i < array.length; i++) {
			if(array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}
}
