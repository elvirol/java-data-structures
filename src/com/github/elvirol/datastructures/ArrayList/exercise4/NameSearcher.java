package com.github.elvirol.datastructures.ArrayList.exercise4;

import java.util.ArrayList;
import java.util.Arrays;

public class NameSearcher {
	public static void main(String[] args) {
		ArrayList<String> arrList = new ArrayList<>(Arrays.asList("test1", "test2", "Test3"));
		
		System.out.println(containsName(arrList, "test1"));
		System.out.println(containsName(arrList, "test3"));
	}
	public static boolean containsName(ArrayList<String> arrList, String target) {
		if(arrList == null || arrList.size() == 0) {
			throw new IllegalArgumentException("ArrayList cannot be null or empty.");
		}
		
		for(String name: arrList) {
			if(name.equalsIgnoreCase(target))return true;
		}
		
		return false;
	}
}
