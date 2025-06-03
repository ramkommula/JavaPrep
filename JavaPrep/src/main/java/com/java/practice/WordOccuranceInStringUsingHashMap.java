package com.java.practice;

import java.util.HashMap;

public class WordOccuranceInStringUsingHashMap {
	
	public static void main(String[] args) {
		
		String str = "Hena is a girl and Robb is a boy";
		
		HashMap<String, Integer> hashmap = new HashMap<> ();
		
		String[] words = str.split(" ");
		
		for(String word : words)
		{
			if(hashmap.containsKey(word))
			{
				hashmap.put(word, hashmap.get(word)+1);
			}
			else {
				hashmap.put(word, 1);
			}
		}
		System.out.println(hashmap.toString());
	}

}
