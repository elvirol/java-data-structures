package com.github.elvirol.datastructures.ArrayList.exercise1;

import java.util.ArrayList;

public class BasicArrayListDemo {
	public static void main(String[] args) {
		ArrayList<String> firstnames = new ArrayList<String>();
		
		firstnames.add("Alice");
		firstnames.add("Bob");
		firstnames.add("Claire");
		
		System.out.println(firstnames);
		System.out.println("first name: " + firstnames.get(0));
		System.out.println("Total number of name: " + firstnames.size());
	}
}
