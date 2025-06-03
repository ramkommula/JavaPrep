package com.java.practice;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafeIteration {
	
	public static void main(String[] args) {
		
		/*
		 * "Fail-fast" and "fail-safe" are two different strategies for handling concurrent modifications during iteration 
		 * over a data structure in Java, such as a collection like ArrayList, HashSet, or HashMap. These strategies address 
		 * the potential issues that can arise when multiple threads are simultaneously modifying and iterating over the 
		 * same data structure.
		 * 
		 * Fail-fast iteration is the default iteration strategy used in most of the Java collections. 
		 * It involves detecting concurrent modifications during iteration and immediately throwing
		 * a ConcurrentModificationException if any structural modification (adding, removing elements) is detected while iterating.
		 * 
		 * Fail-safe iteration, on the other hand, is an alternative strategy that allows concurrent modifications during iteration 
		 * without throwing any exceptions. Instead of working directly on the original data structure, fail-safe iterators 
		 * create a copy of the data structure and iterate over the copy. This way, any modifications made during the iteration 
		 * do not affect the original data structure, and the iteration continues without disruption.
		 * 
		 */
		
		ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
		map.put("A", 1);
		map.put("B", 2);
		map.put("C", 3);

		Iterator<String> iterator = map.keySet().iterator();
		while (iterator.hasNext()) {
		    String key = iterator.next();
		    if (key.equals("B")) {
		        map.remove(key); // Concurrent modification but doesn't throw an exception
		    }
		}
		
		
	}

}
