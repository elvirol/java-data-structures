package com.github.elvirol.datastructures.ArrayList.exercise7;

import java.util.ArrayList;
import java.util.Arrays;

public class NameListMerger {
	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>(Arrays.asList("Alice", "Bob", "Claire"));
		ArrayList<String> list2 = new ArrayList<String>(Arrays.asList("bob", "Diana", "alice"));
		
		System.out.println(mergeWithoutDuplicates(list1, list2));
		}
	public static ArrayList<String> mergeWithoutDuplicates(ArrayList<String> list1, ArrayList<String> list2){
		   if (list1 == null || list2 == null) {
	            throw new IllegalArgumentException("Neither list can be null.");
	        }

	        ArrayList<String> result = new ArrayList<>();
	        ArrayList<String> seenLowerCase = new ArrayList<>();

	        for (String name : list1) {
	            if (!seenLowerCase.contains(name.toLowerCase())) {
	                result.add(name);
	                seenLowerCase.add(name.toLowerCase());
	            }
	        }

	        for (String name : list2) {
	            if (!seenLowerCase.contains(name.toLowerCase())) {
	                result.add(name);
	                seenLowerCase.add(name.toLowerCase());
	            }
	        }

	        return result;
	}
}
