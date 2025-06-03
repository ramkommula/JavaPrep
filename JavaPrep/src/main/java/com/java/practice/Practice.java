package com.java.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

public class Practice {
	
	private String name;

	Practice(String name) {
		this.name = name;
	}
	
	public void println()
	{
		System.out.println(this.name);
		
		//return this.name;
	}







	public static void main(String[] args) {
		
		System.out.println(true && false);
		System.out.println(true && false || true);
		
		System.out.println("------------------------");
		
		Map<String, Integer> map = new HashMap<>();
		map.putIfAbsent("a", 1);
		map.putIfAbsent("b", 2);
		map.putIfAbsent("c", 3);
		
		int result = 0;
		for(Entry<String, Integer> entry : map.entrySet())
		{
			result += entry.getValue();
		}
		System.out.println(result);
		
		System.out.println("------------------------");
		
		System.out.println(new Practice("Test"));
		
		System.out.println("------------------------");
		
		String val = null;
		Optional<String> opt = Optional.of(val);
		System.out.println(opt.isPresent());
		
		Optional<String> opt1 = Optional.ofNullable(val);
		System.out.println(opt1);
		
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		
		list.forEach(x -> {
			System.out.println(x);
		});
		
		
		
		
		
		
	}

}
