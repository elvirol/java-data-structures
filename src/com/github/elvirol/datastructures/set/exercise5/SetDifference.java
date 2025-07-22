package com.github.elvirol.datastructures.set.exercise5;

import java.util.HashSet;
import java.util.Set;

public class SetDifference {
	public static void main(String[] args) {
		Set<Integer> test1 = new HashSet<Integer>(Set.of(10, 20, 30, 40));
		Set<Integer> test2 = new HashSet<Integer>(Set.of(30, 40, 50, 60));
		
		System.out.println(findSetDifference(test1, test2));
		
	}
	public static <T> Set<T> findSetDifference(Set<T> s1, Set<T> s2){
		if(s1 == null || s2 == null || s1.isEmpty()) {
			throw new IllegalArgumentException("Sets cannot be null or empty");
		}
		
		Set<T> answer = new HashSet<>(s1);
		
		answer.removeAll(s2);
		
		return answer;
	}

}
