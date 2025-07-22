package com.github.elvirol.datastructures.Stream.exercise1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class TotalSalesByCategory {
	public static void main(String[] args) {
		
		List<Product> listTest = List.of(
				new Product("test1", "test1", 22.5),
				new Product("test2", "test2", 10.5),
				new Product("test1", "test1", 10),
				new Product("test2", "test2", 30)
		);
	
		System.out.println(computeTotalSalesByCategory(listTest));
	}
	public static Map<String, Double> computeTotalSalesByCategory(List<Product> products){
		Objects.requireNonNull(products, "Map cannot be null");
		
		return products.stream()
				.collect(Collectors
				.groupingBy(Product :: category, Collectors
				.summingDouble(Product :: price)));
		
		
	}
}
