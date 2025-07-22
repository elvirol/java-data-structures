package com.github.elvirol.datastructures.Stream.exercise7;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class GroupByInitial {
	public static void main(String[] args) {
		List<String> test = List.of("Alice", "Alex", "bob", "Bruno", "Charlie", "carole", "David", "Daniel");
		
		System.out.println(groupingByInitial(test));
	}
	public static Map<String, List<String>> groupingByInitial(List<String> names){
		Objects.requireNonNull(names, "List cannot be null.");
		
		return names.stream()
				.filter(s -> s != null && !s.isEmpty())
				.collect(Collectors.groupingBy(s -> s.substring(0, 1).toUpperCase()));
	}
}
