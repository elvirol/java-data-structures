package com.github.elvirol.datastructures.Stream.exercise3;

import java.util.List;
import java.util.Objects;

public class EvenNumber {
	public static void main(String[] args) {
		List<Integer> test = List.of(4, 5, 8, 9, 2, 1, 7);
		
		showEvenNumber(test);
	}
	public static void showEvenNumber(List<Integer> numbers) {
		Objects.requireNonNull(numbers, "List cannot be null");
		
		numbers
			.stream()
			.filter(n -> n % 2 == 0)
			.forEach(System.out :: println);
	}

}
