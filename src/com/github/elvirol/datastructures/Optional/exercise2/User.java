package com.github.elvirol.datastructures.Optional.exercise2;

public class User {
	private String name;
	private int age;
	private String country;
	
	public User(String name, int age, String country){
		this.name = name;
		this.age = age;
		this.country = country;
	}
	
	public String getString() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getCountry() {
		return country;
	}
}

