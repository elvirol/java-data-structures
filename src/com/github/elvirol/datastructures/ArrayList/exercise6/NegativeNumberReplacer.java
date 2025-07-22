package com.github.elvirol.datastructures.ArrayList.exercise6;

import java.util.ArrayList;
import java.util.Arrays;

public class NegativeNumberReplacer {
	public static void main(String[] args) {
		ArrayList<Integer> arrList = new ArrayList<Integer>(Arrays.asList(4, -2, 7, -9, 3));
		
		System.out.println(replaceNegatives(arrList));
	}
	public static ArrayList<Integer> replaceNegatives(ArrayList<Integer> arrList){
		if(arrList == null || arrList.size() == 0) {
			throw new IllegalArgumentException("ArrayList cannot be null or empty");
		}
		
		for(int i = 0; i < arrList.size(); i++) {
			if(arrList.get(i) < 0) arrList.set(i, 0);
		}
		
		return arrList;
	}
}
