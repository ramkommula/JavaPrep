package com.java.practice;

import java.util.StringJoiner;

public class StringJoinerExample {
	
	public static void main(String[] args) {
		
		StringJoiner sj1 = new StringJoiner(",");
		
		sj1.add("A").add("B").add("C");
		
		System.out.println(sj1); //Output is A,B,C
		
		StringJoiner sj2 = new StringJoiner(":");
		
		sj2.add("P").add("Q");
		
		System.out.println(sj2); //Output is P:Q
		
		System.out.println(sj1.merge(sj2)); //Output is A,B,C,P:Q
		
		
	}

}
