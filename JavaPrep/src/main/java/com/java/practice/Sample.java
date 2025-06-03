package com.java.practice;

import java.util.HashMap;
import java.util.Map;

public class Sample {
	
	public static void main(String[] args) {
		
		String str = "I am ram";
		
		char[] ch = str.toCharArray();
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(char c : ch)
		{
			if(map.containsKey(c))
			{
				map.put(c, map.get(c)+1);
			}
			else
			{
				map.put(c, 1);
			}
		}
		
		for(Map.Entry<Character, Integer> m : map.entrySet())
		{
			System.out.println(m.getKey() + " " + m.getValue());
		}
	
		
	}

}
