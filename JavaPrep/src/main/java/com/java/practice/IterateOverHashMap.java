package com.java.practice;

import java.util.HashMap;
import java.util.Map;

public class IterateOverHashMap {
	
	public static void main(String[] args) {
		
		HashMap<String, String> map = new HashMap<>();
		
		map.put("J", "Java");
		map.put("S", "Spring Boot");
		map.put("H", "Hibernate");
		map.put("P", "PostgreSQL");
		map.put("R", "React");
		
		for(Map.Entry<String, String> collect : map.entrySet() )
		{
			System.out.println("Key is " + collect.getKey() + " Value is " + collect.getValue());
		}
	}

}
