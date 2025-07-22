package com.github.elvirol.datastructures.Optional.exercise3;

import java.util.Arrays;
import java.util.Map;

public class LeetCode {
	public static void main(String[] args) {
		
		String test = "MCMXCIV";
		String[] tab = test.split("");
		
		System.out.println(romanToInt(test));
		
	}
	
	 public static int romanToInt(String s) {
		 
    Map<String, Integer> symbole = Map.of(
       "I", 1, 
       "V", 5, 
       "X", 10, 
       "L", 50, 
       "C", 100, 
       "D", 500, 
       "M", 1000
    );

    String[] split = s.split("");
    int result = 0;
    int lastValue = Integer.MAX_VALUE;
    
    for(String l : split) {
    	if(symbole.containsKey(l.toUpperCase())) {
    		int value = symbole.get(l);
    		
    		if(value <= lastValue) {
    			result += value;
    			lastValue = value;
    		}else {
    			result -= value;
    			lastValue = value;
    		}
    	}
    }
    
    return result;
    
}

}
