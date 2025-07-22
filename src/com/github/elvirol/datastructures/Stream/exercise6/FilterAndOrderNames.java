package com.github.elvirol.datastructures.Stream.exercise6;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class FilterAndOrderNames {
	public static void main(String[] args) {
		List<String> test = List.of("Alice", "bob", "Charlie", "alice", "David", "Bob", "Émilie");
		
		System.out.println(sortAndFilterNames(test));
		
	}
	public static List<String> sortAndFilterNames(List<String> names){
		 Objects.requireNonNull(names, "List cannot be null.");
		 
		 return names
				 .stream()
				 .filter(Objects :: nonNull)
				 .distinct()
				 .filter(s -> !s.isEmpty() && Character.isUpperCase(s.charAt(0)))
				 .sorted()
				 .collect(Collectors.toList());
	}

}
