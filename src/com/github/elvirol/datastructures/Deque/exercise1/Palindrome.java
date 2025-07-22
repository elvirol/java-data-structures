package com.github.elvirol.datastructures.Deque.exercise1;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Palindrome {
	public static void main(String[] args) {
		System.out.println(isPalindrome("radar"));
		System.out.println(isPalindrome("Radar"));
		System.out.println(isPalindrome("salut"));
	}
	public static boolean isPalindrome(String word) {
		if(word == null || word.length() == 0) {
			throw new IllegalArgumentException("String cannot be null or empty.");
		}
		
		Deque<Character> deque = new ArrayDeque<>();
		
		for(Character c: word.toLowerCase().toCharArray()) {
			deque.add(c);
		}
		
		while(deque.size() > 1) {
			if(deque.pollFirst() != deque.pollLast()) {
				return false;
			}
		}
		
		return true;
	}
}
