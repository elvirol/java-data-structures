package com.github.elvirol.datastructures.set.exercise2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class NameUniquenessChecker {
	public static void main(String[] args) {
		List<String> testList = new ArrayList<String>(Arrays.asList("Alice", "Bob", "alice"));
		
		System.out.println(areAllNamesUnique(testList));
		
		
	}
	public static boolean areAllNamesUnique(List<String> list) {
		if(list == null || list.isEmpty()) {
			throw new IllegalArgumentException("list cannot be null or empty");
		}
		
		Set<String> cleanList = new LinkedHashSet<String>();
		
		for(String word: list) {
			cleanList.add(word.toLowerCase());
		}

		return list.size() == cleanList.size();
	}

}
