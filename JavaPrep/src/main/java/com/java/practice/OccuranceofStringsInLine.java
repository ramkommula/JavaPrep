package com.java.practice;

import java.util.HashMap;
import java.util.Map;

public class OccuranceofStringsInLine {
	
	public static void main(String[] args) {
		
		String words = "this place is reserved for this person, is from india";
		
		String[] word = words.split(" ");
		
		HashMap<String, Integer> map = new HashMap<>();
		
		for(String str : word)
		{
			if(map.containsKey(str))
			{
				map.put(str, map.get(str)+1);
			}
			else {
				map.put(str, 1);
			}
		}
		
		for(Map.Entry<String, Integer> m : map.entrySet())
		{
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
		
		
		
	}

}
