package com.github.elvirol.datastructures.Stream.exercise1;

public class Product {
	
	private String name;
	private String category;
	private double price;
	
	public Product(String name, String category, double price) {
		this.name = name;
		this.category = category;
		this.price = price;
	}
	
	public String name() {
		return name;
	}
	
	public String category() {
		return category;
	}
	
	public double price() {
		return price;
	}

}
