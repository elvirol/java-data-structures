package com.github.elvirol.datastructures.Optional.exercise4;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class AgeByCountry {
	public static void main(String[] args) {
		
		List<User> test = List.of(
				new User("Jhon", "France", 12),
				new User("Tom", "France", 29),
				new User("Charli", "Maroc", 12),
				new User("Red", "Maroc", 33)
				);
		
		
	}
	public static Map<String, Double> averageAgeByCountry(List<User> users){
		Objects.requireNonNull(users, "List cannot be null.");
		
		return users.stream()
		.filter(Objects :: nonNull)
		.filter(u -> u.getCountry() != null)
		.collect(Collectors.groupingBy(User :: getCountry, Collectors.averagingInt(User :: getAge)));
		
	}

}
