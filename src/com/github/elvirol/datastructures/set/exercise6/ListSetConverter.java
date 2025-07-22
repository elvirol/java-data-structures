package com.github.elvirol.datastructures.set.exercise6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListSetConverter {
	public static void main(String[] args) {
		List<String> dupplicatesListTest = List.of("Alice", "Bob", "Alice", "Charlie", "Bob");
		
		System.out.println(removeDuplicates(dupplicatesListTest));
		
	}
	public static <T> Set<T> removeDuplicates(List<T> list){
		if(list == null || list.isEmpty()) {
			throw new IllegalArgumentException("Lists cannot be null or empty");
		}
		
		 Set<T> answer = new HashSet<>(list);
		 
		 return answer;
	}
	
	public static <T> List<T> convertToList(Set<T> set){
		if(set == null || set.isEmpty()) {
			throw new IllegalArgumentException("Set cannot be null or empty");
		}
		
		List<T> answer = new ArrayList<T>(set);
		
		return answer;
	}

}
