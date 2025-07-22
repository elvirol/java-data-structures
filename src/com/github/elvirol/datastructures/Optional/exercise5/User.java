package com.github.elvirol.datastructures.Optional.exercise5;

import java.util.Optional;

public class User {
	private String name;
	private Optional<String> email;
	
	public User(String name, Optional<String> email) {
		this.name = name;
		this.email = email;
	}
	
	public String getName() {
		return name;
	}
	
	public Optional<String> getEmail(){
		return email;
	}
}
