package com.java.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class PrintEvenAfter5 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(2);
		list.add(5);
		list.add(9);
		list.add(6);
		list.add(8);
		
	     List<Integer> filteredlist = list.stream().filter(x -> x%2 == 0 && x > 5).collect(Collectors.toList());
	     
	     System.out.println(filteredlist);
	}

}
