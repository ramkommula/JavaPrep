package com.java.practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class IterateHashMapUsingWhileandForLoop {
	
	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<>();
		map.put("One", 1);
		map.put("Two", 2);
		map.put("Three", 3);
		
		Iterator itr = map.entrySet().iterator();
		
		while(itr.hasNext())
		{
			Map.Entry<String, Integer> it = (Entry<String, Integer>) itr.next();
			System.out.println(it.getKey() + " " + it.getValue());
		}
		System.out.println("----------------------------");
		
		for(Map.Entry<String, Integer> m : map.entrySet())
		{
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}

}
