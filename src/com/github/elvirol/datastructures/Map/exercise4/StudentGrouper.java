package com.github.elvirol.datastructures.Map.exercise4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentGrouper {
	public static void main(String[] args) {
		List<Student> students = List.of(
			    new Student("Alice", "Informatique"),
			    new Student("Bob", "Mathématiques"),
			    new Student("Charlie", "Informatique"),
			    new Student("David", "Physique")
				);
		
		System.out.println(groupByFiliere(students));
		
	}
	public static Map<String, List<String>> groupByFiliere(List<Student> listStudent){
		if(listStudent == null || listStudent.isEmpty()) {
			throw new IllegalArgumentException("List cannot be null or empty.");
		}
		
		Map<String, List<String>> anser = new HashMap<>();
		
		
		for(Student student: listStudent) {
			String name = student.getName();
			String track = student.getTrack();
			
			anser.computeIfAbsent(track, (k) ->  new ArrayList<String>()).add(name);
		}
		
		return anser;
	}
}
