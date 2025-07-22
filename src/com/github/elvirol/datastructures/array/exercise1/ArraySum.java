package com.github.elvirol.datastructures.array.exercise1;

public class ArraySum {
    public static void main(String[] args) {
        int array[] = {5, 10, 3};
        System.out.println(sumArray(array));

    }
    public static int sumArray(int[] array) {
        int sum = 0;
        for(int i = 0; i < array.length; i ++) {
            if(array[i] % 2 == 0) {
                sum += array[i];
            }

        }
        return sum;
    }
    
}
