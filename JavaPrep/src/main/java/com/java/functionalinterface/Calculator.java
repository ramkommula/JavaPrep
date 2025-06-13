package com.java.functionalinterface;

public class Calculator {
	
	public static void main(String[] args) {
		Square square = (Square) x -> x*x;
		
		int value = square.calculate(5);
		
		System.out.println(value);
	}

}
