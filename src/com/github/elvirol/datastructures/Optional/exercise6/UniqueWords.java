package com.github.elvirol.datastructures.Optional.exercise6;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class UniqueWords {
	public static void main(String[] args) {
		List<String> test = List.of("hello world", "java stream");
		
		System.out.println(extractsUniqueWords(test));
		
	}
	public static List<String> extractsUniqueWords(List<String> wordList){
		Objects.requireNonNullElse(wordList, "List cannot be null");
		
		return wordList.stream()
				.flatMap(s -> Arrays.stream(s.split(" ")))
				.distinct()
				.sorted()
				.collect(Collectors.toList());
	}
}
