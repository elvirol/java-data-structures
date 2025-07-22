package com.github.elvirol.datastructures.ArrayList.exercie3;

import java.util.ArrayList;
import java.util.Arrays;

public class UniqueElementsExtractor {
	public static void main(String[] args) {
		ArrayList<Integer> test = new ArrayList<>(Arrays.asList(2, 4, 2, 6, 7, 8, 9, 7, 4));
		
		System.out.println(removeDuplicates(test));
		
	}
	public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> arrList){
		    if (arrList == null || arrList.isEmpty()) {
		        throw new IllegalArgumentException("ArrayList cannot be null or empty.");
		    }

		    ArrayList<Integer> answer = new ArrayList<>();
		    for (Integer item : arrList) {
		        if (!answer.contains(item)) {
		            answer.add(item);
		        }
		    }
		    return answer;
		}

}
