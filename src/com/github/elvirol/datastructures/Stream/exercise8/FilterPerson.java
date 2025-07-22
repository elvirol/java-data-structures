package com.github.elvirol.datastructures.Stream.exercise8;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class FilterPerson {
	public static void main(String[] args) {
		List<Person> test = List.of(
				new Person("Charlie", 25),
				new Person("Bob", 18),
				new Person("Victor", 12)
				);
		System.out.println(getAdultNamesSorted (test));
	}
	public static List<String> getAdultNamesSorted (List<Person> persons){
		Objects.requireNonNull(persons, "List cannot be null");
		
		return persons.stream()
				.filter(Objects :: nonNull)
				.filter(p -> p.getAge() >= 18)
				.map(Person :: getName)
				.sorted()
				.collect(Collectors.toList());			
	}
}
