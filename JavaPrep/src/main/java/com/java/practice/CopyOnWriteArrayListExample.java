package com.java.practice;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExample {
	
	public static void main(String args[]) {
		
		/*
		 * CopyOnWriteArrayList is synchronized and thread safe
		 * 
		 * CopyOnWriteArrayList is fail-safe and it will never throw ConcurrentModificationException during iteration. 
		 * The reason behind the it that CopyOnWriteArrayList creates a new arraylist every time it is modified.
		 * 
		 * CopyOnWriteArrayList is slower than ArrayList.
		 */

	      // create an array list
	      CopyOnWriteArrayList<String> al = new CopyOnWriteArrayList();
	      System.out.println("Initial size of al: " + al.size());

	      // add elements to the array list
	      al.add("C");
	      al.add("A");
	      al.add("E");
	      al.add("B");
	      al.add("D");
	      al.add("F");
	      al.add(1, "A2");
	      System.out.println("Size of al after additions: " + al.size());

	      // display the array list
	      System.out.println("Contents of al: " + al);

	      // Remove elements from the array list
	      al.remove("F");
	      al.remove(2);
	      System.out.println("Size of al after deletions: " + al.size());
	      System.out.println("Contents of al: " + al);

	      try{
	         Iterator<String> iterator = al.iterator();
	         while(iterator.hasNext()) {
	            iterator.remove(); //CopyOnWriteArrayList.remove() method throws exception 
	            				   //if elements are tried to be removed during iteration.
	         }
	      }catch(UnsupportedOperationException e) {
	         System.out.println("Method not supported:");
	      }
	      System.out.println("Size of al: " + al.size());
	   }

}
