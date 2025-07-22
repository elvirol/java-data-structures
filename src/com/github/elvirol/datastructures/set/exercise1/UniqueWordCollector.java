package com.github.elvirol.datastructures.set.exercise1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueWordCollector {
	public static void main(String[] args) {
		List<String> testList = new ArrayList<String>(Arrays.asList("Java", "Python", "JAVA", "python", "C++"));
		
		System.out.println(collectUniqueWords(testList));
		
	}
	public static Set<String> collectUniqueWords(List<String> list ){
		if(list == null) {
			throw new IllegalArgumentException("list cannot be null");
		}
		Set<String> cleanList = new HashSet<>();
		
		for(String word: list) {
			cleanList.add(word.toLowerCase());
		}
		
		return cleanList;
	}

}
