package com.github.elvirol.datastructures.Map.exercise6;

import java.util.HashMap;
import java.util.Map;

public class EmployeeHoursFilter {
	public static void main(String[] args) {
		Map<String, Integer> test = new HashMap<>();
				test.put("Alice", 50);
				test.put("Bob", 100);
				test.put("Charli", 75);	
				test.put("Maria", 25);
				
				System.out.println(filterByMinHours(test, 50));
	}
	public static Map<String, Integer> filterByMinHours(Map<String, Integer> worker, int minHours){
		if(worker == null || worker.isEmpty()) {
			throw new IllegalArgumentException("Map cannot be null or empty");
		}
		
		Map<String, Integer> anser = new HashMap<>();
		
		for(String name: worker.keySet()) {
			if(worker.get(name) >= minHours) {
				anser.put(name, worker.get(name));	
			}
		}
		
		return anser;
	}

}
