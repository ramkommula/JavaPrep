package com.java.practice;

import java.util.ArrayList;

public class MethodReferenceExample {
	
	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<>();
		names.add("Ram");
		names.add("Kalyan");
		names.add("Varun");
		
		names.forEach(System.out::println);
	}

}
