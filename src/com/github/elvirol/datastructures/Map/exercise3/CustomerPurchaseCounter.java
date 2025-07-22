package com.github.elvirol.datastructures.Map.exercise3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerPurchaseCounter {
	public static void main(String[] args) {
		
		List<Purchase> test = List.of(
				new Purchase("Alice", 200),
				new Purchase("Bob", 100),
				new Purchase("Charle", 50),
				new Purchase("Alice", 150),
				new Purchase("Bob", 350)
				);
		
		System.out.println(findCustomerPurchaseCounter(test));
		
	}
	public static Map<String, Integer> findCustomerPurchaseCounter(List<Purchase> list){
		if(list == null || list.isEmpty()) {
			throw new IllegalArgumentException("List cannot be null or empty.");
		}
		
		Map<String, Integer> anser = new HashMap<>();
		
		for(Purchase person : list) {
			anser.put(person.getName(), anser.getOrDefault(person.getName(), 0) + 1);
		}
		
		return anser;
	}
}
