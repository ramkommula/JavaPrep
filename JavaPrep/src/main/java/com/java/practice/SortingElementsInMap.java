package com.java.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortingElementsInMap {
	
	public static void main(String[] args) {
		
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(1, 1);
		map.put(3, 1);
		map.put(2, 1);
		map.put(5, 1);
		map.put(4, 1);
		map.put(6, 1);
		
		for(Map.Entry<Integer, Integer> m : map.entrySet())
		{
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
		System.out.println("-----------------");
		
		TreeMap<Integer, Integer> treeMap = new TreeMap<>();
		treeMap.putAll(map);
		
		for(Map.Entry<Integer, Integer> m : treeMap.entrySet())
		{
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
	}

}
