package com.java.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class OccuranceExampleUsingHashMap {
	
public static void main(String[] args) {
		
		String str1 = "iamramkommula";
				
		HashMap<Character, Integer> map1 = new HashMap<>();
		for(int i=0; i<str1.length(); i++)
		{
			char ch = str1.charAt(i);
			if(map1.containsKey(ch))
			{
				map1.put(ch, map1.get(ch) + 1);
			}
			else {
				map1.put(ch, 1);
			}
		}
		
		for(Map.Entry<Character, Integer> m1 : map1.entrySet())
		{
			System.out.print(m1.getKey() + "-" + m1.getValue() + " ");
		}
		
		System.out.println();
		System.out.println("--------------------------------");
		
		String str2 = "my name is ram and my language is java";
		
		String[] words = str2.split("\\s");
		
		HashMap<String, Integer> map2 = new HashMap<>();
		
		for(String word : words)
		{
			if(map2.containsKey(word))
			{
				map2.put(word, map2.get(word)+1);
			}
			else {
				map2.put(word, 1);
			}
		}
		for(Map.Entry<String, Integer> m2 : map2.entrySet())
		{
			System.out.print(m2.getKey() + "-" + m2.getValue() + " ");
		}
		
		System.out.println();
		System.out.println("--------------------------------");
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(1);
		list.add(2);
		list.add(2);
		list.add(3);
		list.add(4);
		
		HashMap<Integer, Integer> map3 = new HashMap<>();
		
		for(Integer num : list)
		{
			if(map3.containsKey(num))
			{
				map3.put(num, map3.get(num)+1);
			}
			else {
				map3.put(num, 1);
			}
		}
		for(Map.Entry<Integer, Integer> m3 : map3.entrySet())
		{
			System.out.print(m3.getKey() + "-" + m3.getValue() + " ");
		}	
	}

}
