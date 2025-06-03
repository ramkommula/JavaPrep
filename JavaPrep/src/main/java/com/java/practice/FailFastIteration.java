package com.java.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class FailFastIteration {
	
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
		
		List<Integer> list = new ArrayList((Arrays.asList(1, 2, 3, 4, 5)));

		Iterator<Integer> iterator = list.iterator();
		while (iterator.hasNext()) {
		    int value = iterator.next();
		    if (value == 3) {
		        list.remove(Integer.valueOf(value)); // Concurrent modification
		    }
		}

	}

}
