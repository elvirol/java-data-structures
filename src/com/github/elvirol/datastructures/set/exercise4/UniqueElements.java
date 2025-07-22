package com.github.elvirol.datastructures.set.exercise4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueElements {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>(Arrays.asList("Java", "Python", "C++"));
		List<String> list2 = new ArrayList<String>(Arrays.asList("python", "Rust", "JAVA"));
		
		System.out.println(findUniqueElements(list1, list2));
	}
	public static Set<String> findUniqueElements(List<String> list1, List<String> list2){
		if(list1 == null || list2 == null || list1.isEmpty() || list2.isEmpty()) {
			throw new IllegalArgumentException("lists cannot be null or empty");
		}
		
		Set<String> uniqueElements = new HashSet<>();
		
		list1.forEach(word -> uniqueElements.add(word.toLowerCase()));
		list2.forEach(word -> uniqueElements.add(word.toLowerCase()));
		
		return uniqueElements;
	}

}
