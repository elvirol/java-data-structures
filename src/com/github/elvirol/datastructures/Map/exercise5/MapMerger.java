package com.github.elvirol.datastructures.Map.exercise5;

import java.util.HashMap;
import java.util.Map;

public class MapMerger {
	public static void main(String[] args) {
		Map<String, Integer> test1 = new HashMap<>();
		test1.put("Alice", 100);
		test1.put("Bob", 150);
		
		Map<String, Integer> test2 = new HashMap<>();
		test2.put("Alice", 400);
		test2.put("Bob", 150);
		test2.put("Charlie", 60);
		
		System.out.println(mergeMaps(test1, test2));
	}
	public static Map<String, Integer> mergeMaps(Map<String, Integer> map1, Map<String, Integer> map2){
		if(map1 == null || map2 == null) {
			throw new IllegalArgumentException("Maps cannot be null");
		}
		
	    Map<String, Integer> result = new HashMap<>(map2);

	    for (String key : map1.keySet()) {
	        result.merge(key, map1.get(key), Integer::sum);
	    }

	    return result;
	}
}
