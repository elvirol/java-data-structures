package com.github.elvirol.datastructures.set.exercise3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CommonElementFinder {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>(Arrays.asList("Java", "Python", "C++"));
		List<String> list2 = new ArrayList<String>(Arrays.asList("python", "JAVA", "Rust"));
		
		System.out.println(findCommonElement(list1, list2));
		
	}
	
	public static Set<String> findCommonElement(List<String> list1, List<String> list2){
		if(list1 == null || list2 == null || list1.isEmpty() || list2.isEmpty()) {
			throw new IllegalArgumentException("lists cannot be null or empty");
		}
			
		Set<String> set1 = new HashSet<>();
		Set<String> commonElementList = new HashSet<>();
		
		for(String word1: list1) {
			set1.add(word1.toLowerCase());
		}
		
		for(String word2: list2) {
			if(set1.contains(word2.toLowerCase())) commonElementList.add(word2.toLowerCase());
		}
		
		return commonElementList;
	}

}
