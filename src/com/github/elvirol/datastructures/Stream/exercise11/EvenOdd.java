package com.github.elvirol.datastructures.Stream.exercise11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class EvenOdd {
	public static void main(String[] args) {
		List<Integer> test = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, null, 8));
		
		System.out.println(partitionEvenOdd(test));
	}
	public static Map<Boolean, List<Integer>> partitionEvenOdd(List<Integer> numbers){
		Objects.requireNonNull(numbers,"List cannot be null.");
		
		return numbers.stream()
			.filter(Objects :: nonNull)
			.collect(Collectors.groupingBy(n -> n %2 == 0));
	}
}
