package com.github.elvirol.datastructures.ArrayList.exercise9;

import java.util.ArrayList;
import java.util.Arrays;

public class WordFrequencyCounter {
	public static void main(String[] args) {
		ArrayList<String> testList = new ArrayList<String>(Arrays.asList("java", "Python", "JAVA", "C++", "python"));
		
		System.out.println(countOccurrences(testList, "java"));
	}
	public static int countOccurrences(ArrayList<String> list, String target) {
		if(list == null) {
			throw new IllegalArgumentException("ArrayList cannot be null");
		}
			
		int count = 0;
		
		for(String word: list) {
			if(word.equalsIgnoreCase(target)) count++;
		}
		
		return count;
	}

}
