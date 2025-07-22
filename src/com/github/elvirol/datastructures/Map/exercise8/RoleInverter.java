package com.github.elvirol.datastructures.Map.exercise8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RoleInverter {
	public static void main(String[] args) {
		Map<String, String> test = new HashMap<>();
		
		test.put("Alice", "Admin");
		test.put("Bob", "Editor");
		test.put("Charli", "admin");
		test.put("Sami", "viewer");
		
		System.out.println(invertMap(test));	
	}
	
	public static Map<String, List<String>> invertMap(Map<String, String> input){
		if(input == null || input.isEmpty()) {
			throw new IllegalArgumentException("Map cannot be null or empty");
		}
		Map<String, List<String>> anser = new HashMap<>();
		for(Map.Entry<String, String> entry: input.entrySet()) {
			String key = entry.getKey();
			String value = entry.getValue().toLowerCase();
			
			anser.computeIfAbsent(value, (k) -> new ArrayList<String>()).add(key);
		}
		
		return anser;
	}

}
