package com.github.elvirol.datastructures.Map.exercise7;

import java.util.HashMap;
import java.util.Map;

public class EmployeeInfo {
	public static void main(String[] args) {
		Map<String, Employee> test = new HashMap<>();
		
		test.put("Alice", new Employee("Manager", 50000));
		
		System.out.println(findEmployeeInfo(test, "Alice"));
		System.out.println(findEmployeeInfo(test, "alice"));
		System.out.println(findEmployeeInfo(test, "Charle"));
		
	}
	public static String findEmployeeInfo(Map<String, Employee> employee, String name) {
		if(employee == null || name == null) {
			throw new IllegalArgumentException("Map or String cannot be null");
		}
		
		String anser = "Employee not found.";
		
		for(Map.Entry<String, Employee> entry: employee.entrySet()) {
			String key = entry.getKey();
			Employee value = entry.getValue();
			
			if(key.equalsIgnoreCase(name)) {
				anser = "Nom: " + key + value.toString(); 
			}
			}
		
		return anser;
	}

}
