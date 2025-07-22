package com.github.elvirol.datastructures.Map.exercise2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordFrequencyCounter {
	public static void main(String[] args) {
		
		System.out.println(counterFrequency("Java is great. Java is powerful. Java is versatile!"));
		
	}
	public static Map<String, Integer> counterFrequency (String paragraphe){
		if(paragraphe == null || paragraphe.length() == 0) {
			throw new IllegalArgumentException("String cannot be null or empty");
		}
		
		Map<String, Integer> anser = new HashMap<>();
		String regex = "[\\W_]+";
		
		List<String> wordList = List.of(paragraphe.split(regex));
		
		for(String word: wordList) {
			String lowerCaseWord = word.toLowerCase();
			
			anser.put(lowerCaseWord, anser.getOrDefault(lowerCaseWord, 0) + 1);
		}
		
		return 	anser;
				
	}
}
