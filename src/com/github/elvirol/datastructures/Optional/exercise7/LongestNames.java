package com.github.elvirol.datastructures.Optional.exercise7;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class LongestNames {
	public static void main(String[] args) {
		List<String> test = List.of("Alice", "Bob", "Jonathan", "Charles", "Tom", "Jonathan");
		
		System.out.println(findLongestNames(test));		
	}
	public static Optional<String> findLongestNames(List<String> names){
		Objects.requireNonNull(names, "List cannot be null");
		
		return names
			.stream()
			.max(Comparator.comparing(String :: length));
	}

}
