package com.java.practice;

import java.util.HashMap;
import java.util.Map;

public class OccuranceofCharactersInWord {
	
	public static void main(String[] args) {
		
		String word = "VikramRudra";
		
		char[] chars = word.toCharArray();
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(char c : chars)
		{
			if(map.containsKey(c))
			{
				map.put(c, map.get(c)+1);
			}
			else {
				map.put(c, 1);
			}
		}
		
		for(Map.Entry<Character, Integer> m : map.entrySet())
		{
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}

}
