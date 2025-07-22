package com.github.elvirol.datastructures.Optional.exercise2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class UsersByCountry {
	public static void main(String[] args) {
		
		List<User> testUser = new ArrayList<>();
		testUser.add(new User("Jhon", 12 , "France"));
		testUser.add(new User("Tom", 22 , "France"));
		testUser.add(new User("Didi", 33 , "USA"));
		
		System.out.println(groupUserByCountry(testUser));
	}
	
	public static Map<String, List<User>> groupUserByCountry(List<User> users){
		Objects.requireNonNull(users, "List cannot be null.");
		
	return 	users.stream()
			.filter(Objects :: nonNull)
			.collect(Collectors.groupingBy(User :: getCountry));
	}
}
