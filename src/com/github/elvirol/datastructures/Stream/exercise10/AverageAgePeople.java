package com.github.elvirol.datastructures.Stream.exercise10;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class AverageAgePeople {
	public static void main(String[] args) {
		List<Person> test = List.of(
				 new Person("Alice", 32),
				    new Person("Alex", 28),
				    new Person("Bob", 18),
				    new Person("Bruno", 22),
				    new Person("Charlie", 24),
				    new Person("Chloé", 30)
				);
		
		System.out.println(orderAverageAge(test));
	}
	public static Map<String, Double> orderAverageAge(List<Person> people){
		Objects.requireNonNull(people, "List cannot be null.");
		
		return people.stream()
				.filter(Objects :: nonNull)
				.collect(
						Collectors.groupingBy(p -> p.getName().substring(0, 1).toUpperCase(), 
						Collectors.averagingDouble(Person :: getAge)));
	}
}
