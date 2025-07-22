package com.github.elvirol.datastructures.Deque.exercise2;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Symmetric {
	public static void main(String[] args) {
		int[] test = {1, 2, 3, 2, 1};
		
		System.out.println(isSymmetric(test));
		
	}
	public static boolean isSymmetric(int[] array) {
		if(array == null || array.length == 0) {
			throw new IllegalArgumentException("Array cannot be null or emppty.");
		}
		
		
		
		Deque<Integer> deque = new ArrayDeque<>();
		
		for(int n: array) {
			deque.add(n);
		}
		
		while(deque.size() > 1) {
			System.out.println(deque);
		
			if(!deque.pollFirst().equals(deque.pollLast())) {
				
				return false;
			}
		}
		System.out.println(deque);
		return true;
	}
}
