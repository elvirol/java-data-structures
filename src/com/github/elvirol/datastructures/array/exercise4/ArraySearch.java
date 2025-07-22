package com.github.elvirol.datastructures.array.exercise4;

public class ArraySearch {

	public static void main(String[] args) {
		int[] arr = {3,8,5,9,4};
		System.out.println(search(arr,5));
		
	}
	public static int search(int[] arr, int nb) {
		if(arr == null ||  arr.length == 0) {
			return -1;
		}
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == nb) {
				return i;
			}
		}
		return -1;
	}

}
