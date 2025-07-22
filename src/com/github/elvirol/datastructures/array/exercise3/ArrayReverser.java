package com.github.elvirol.datastructures.array.exercise3;

import java.util.Arrays;

public class ArrayReverser {
    public static void main(String[] args) {
    	int[] arr = {1, 2, 3, 4, 5};
    	System.out.println(Arrays.toString(arr));
    	reverseArray(arr);
    	System.out.println(Arrays.toString(arr));

    }
    public static void reverseArray(int[] array) {
        if (array == null || array.length <= 1) {
            return;
        }

        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }
}
