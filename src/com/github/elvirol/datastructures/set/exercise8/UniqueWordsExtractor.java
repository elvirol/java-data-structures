package com.github.elvirol.datastructures.set.exercise8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UniqueWordsExtractor {
	public static void main(String[] args) {
		String textTest = "Java is great. Java is powerful. Java is versatile!";
		
		System.out.println(extractUniqueWords(textTest));
	}
	public static Set<String> extractUniqueWords(String paragraphe){
		if(paragraphe == null || paragraphe.length() == 0) {
			throw new IllegalArgumentException("Paragraphe cannot be null or empty");
		}
		
		String regex = "[\\W_]+";
		
		Set<String> uniqueWord = new HashSet<String>();
		
		for(String word: paragraphe.split(regex)) {
			if(!word.isBlank()) {
				uniqueWord.add(word.toLowerCase());
			}
		}
		
		return uniqueWord;
	}

}
