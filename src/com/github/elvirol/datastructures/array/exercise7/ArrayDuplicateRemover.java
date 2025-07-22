package com.github.elvirol.datastructures.array.exercise7;

public class ArrayDuplicateRemover {
	public static void main(String[] args) {
		
	}
	public static int[] removeDuplicates(int[] arr) {
		int[] temp = new int[arr.length];
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
		    boolean found = false;
		    for (int j = 0; j < count; j++) {
		        if (arr[i] == temp[j]) {
		            found = true;
		            break;
		        }
		    }
		    if (!found) {
		        temp[count++] = arr[i];
		    }
		}

		int[] result = new int[count];
		System.arraycopy(temp, 0, result, 0, count);
		return result;
	}

}
