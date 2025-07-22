package com.github.elvirol.datastructures.set.exercise7;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PersonSetTest {
	public static void main(String[] args) {
		
		List<Person> people = List.of(
			new Person("Alice", 30),
			new Person("Bob", 25),
			new Person("Charlie", 23),
			new Person("Alice", 30),
			new Person("Bob", 25)
			);
		
		Set<Person> uniquePerson = new HashSet<>(people);
		
		System.out.println(uniquePerson);
	}

}
