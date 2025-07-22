package com.github.elvirol.datastructures.Stream.exercise4;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class CapitalLetter {
	public static void main(String[]args) {
		List<String> test = List.of("alice", "bob", "charlie", "");
		
		System.out.println(firstCapitalletter(test));
		
	}
	public static List<String> firstCapitalletter(List<String> words){
		Objects.requireNonNull(words, "List cannot be null.");
		
		return words
			.stream()
			.map(s -> s.isEmpty() ? s : s.substring(0, 1).toUpperCase() + s.substring(1))
			.collect(Collectors.toList());
	}

}
