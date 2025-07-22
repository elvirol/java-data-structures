package com.github.elvirol.datastructures.set.exercise7;

import java.util.Objects;

public class Person {
	
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	@Override 
	public boolean equals(Object obj) {
		if(this == obj) return true;
		
		if(!(obj instanceof Person)) return false;
		
		Person other = (Person) obj;
		
		return Objects.equals(name, other.name) && age == other.age;
			
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, age);
	}
	
	@Override
	public String toString() {
		return "Name: " + name + " Age: " + age;
	}

}
