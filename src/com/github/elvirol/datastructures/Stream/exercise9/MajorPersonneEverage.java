package com.github.elvirol.datastructures.Stream.exercise9;

import java.util.List;
import java.util.Objects;

public class MajorPersonneEverage {
	public static void main(String[] args) {
		List<Person> test = List.of(
				new Person("Alice", 32),
				new Person("Bob", 17),
				new Person("Charlie", 24),
				new Person("David", 45),
				new Person("Emma", 15)
				);
		
		System.out.println(findMajorPersonneEverage(test));
		
	}
	public static double findMajorPersonneEverage(List<Person> people) {
		Objects.requireNonNull(people, "List cannot be null");
		
		return people.stream()
				.filter(Objects :: nonNull)
				.filter(p -> p.getAge() >= 18)
				.mapToInt(p -> p.getAge())
				.average()
				.orElse(0);			
	}
}
