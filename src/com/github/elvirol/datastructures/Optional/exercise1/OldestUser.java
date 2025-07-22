package com.github.elvirol.datastructures.Optional.exercise1;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class OldestUser {
	public static void main(String[] args) {
		
	}
	public static Optional<User> findOldestUser(List<User> users){
		Objects.requireNonNull(users, "List cannot be null.");
		
			return users.stream()
				.max(Comparator
				.comparingInt(User :: getAge));
	}
}
