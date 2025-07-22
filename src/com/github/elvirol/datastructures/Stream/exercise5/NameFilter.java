package com.github.elvirol.datastructures.Stream.exercise5;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class NameFilter {
	public static void main(String[] args) {
		List<String> test = List.of("luc", "amina", "leo", "bastien", "mia", "thomas");
		
		System.out.println(namesFilter(test));
		
	}
	public static List<String> namesFilter(List<String> names){
		Objects.requireNonNull(names, "List cannot be null.");
		
		return names
			.stream()
			.filter(s -> s != null)
			.filter(s -> s.length() >= 4)
			.map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
			.collect(Collectors.toList());
	}
}
