package com.github.elvirol.datastructures.ArrayList.exercise5;

import java.util.ArrayList;
import java.util.Arrays;

public class WordLengthFilter {
	public static void main(String[] args) {
		ArrayList<String> arrList = new ArrayList<>(Arrays.asList("salut", "romain", "candice", "test", "one"));
		System.out.println(filterByLength(arrList, 3));
	}
	public static ArrayList<String> filterByLength(ArrayList<String> words, int length){
		if(words == null || words.size() == 0) {
			throw new IllegalArgumentException("ArrayList connot be null or empty");
		}
		
		ArrayList<String> newArrayList = new ArrayList<>();
		
		for(String word: words) {
			if(word.length() == length) newArrayList.add(word);
		}
		
		return newArrayList;
	}
}
