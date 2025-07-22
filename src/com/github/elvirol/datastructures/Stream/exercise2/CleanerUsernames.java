package com.github.elvirol.datastructures.Stream.exercise2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class CleanerUsernames {
	public static void main(String[] args) {
		List<String> test = new ArrayList(Arrays.asList("Charlie", " Alice", "bob", "Bob", "  alice", "charlie", null));
		
		System.out.println(cleanUsernames(test));
	}
	
	public static List<String> cleanUsernames(List<String> usernamesList){
		Objects.requireNonNull(usernamesList, "List cannot be null");
		
		return usernamesList.stream()
				.filter(Objects :: nonNull)
				.map( u -> u.toLowerCase().trim())
				.distinct()
				.sorted()
				.collect(Collectors.toList());
	}

}
