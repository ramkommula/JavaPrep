package com.java.practice;

import java.util.ArrayList;
import java.util.Iterator;

public class IterateArrayListUsing3Loops {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		System.out.print("Using while loop  -----> ");
		Iterator<Integer> itr = list.iterator();
		
		while(itr.hasNext())
		{
			System.out.print(itr.next() + " ");
		}
		System.out.println();
		System.out.print("Using for loop  -----> ");
		for(int i=0; i<list.size(); i++)
		{
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		System.out.print("Using advanced for loop  -----> ");
		for(int i : list)
		{
			System.out.print(i + " ");
		}
	}
	
	

}
