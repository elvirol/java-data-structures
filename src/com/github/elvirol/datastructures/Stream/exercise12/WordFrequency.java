package com.github.elvirol.datastructures.Stream.exercise12;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class WordFrequency {
	public static void main(String[] args) {
		List<String> test = List.of("Java is great", "I love Java", "Java Stream is powerful");
		
		System.out.println(countWordFrequency(test));
;		
	}
	public static Map<String, Long> countWordFrequency(List<String> words){
		Objects.requireNonNull(words, "List cannot be null.");
		
		return words.stream()
				.flatMap(w -> Arrays.stream(w.toLowerCase().split("\\s+")))
				.filter(s -> !s.isEmpty())
				.collect(Collectors.groupingBy(w -> w, Collectors.counting()));	
	}
}
