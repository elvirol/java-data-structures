package com.github.elvirol.datastructures.ArrayList.exercise10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class DuplicateRemoverAndSorter {
	public static void main(String[] args) {
		ArrayList<String> test = new ArrayList<>(Arrays.asList("Java", "python", "JAVA", "C++", "Python"));
		System.out.println(cleanAndSortList(test));
		
	}
	public static ArrayList<String> cleanAndSortList(ArrayList<String> list){
		if(list == null) {
			throw new IllegalArgumentException("ArrayList cannot be null");
		}
		
		ArrayList<String> lowerCaseList = new ArrayList<String>();
		for(String word: list) {
			if(!lowerCaseList.contains(word.toLowerCase())) lowerCaseList.add(word.toLowerCase());
		}
		
		 lowerCaseList.sort(Comparator.naturalOrder());
		 
		 return lowerCaseList;
	}



}
