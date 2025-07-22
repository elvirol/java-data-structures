package com.github.elvirol.datastructures.ArrayList.exercise8;

import java.util.ArrayList;
import java.util.Arrays;

public class ListReverser {
	public static void main(String[] args) {
		ArrayList<String> testList = new ArrayList<String>(Arrays.asList("un", "deux", "trois"));
		
		System.out.println(reverseList(testList));
	}
	public static ArrayList<String> reverseList(ArrayList<String> list){
		if(list == null) {
			throw new IllegalArgumentException("ArrayList cannot be null");
		}
		
		ArrayList<String> reverseList = new ArrayList<String>();
		
		for(int i = list.size() -1; i >= 0; i--) {
			reverseList.add(list.get(i));
		}
		
		return reverseList;
	}

}
