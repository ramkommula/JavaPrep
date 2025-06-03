package com.java.practice;

public class StaticExample {
	
	/*
	 * 
	 * Remember that Java doesn't have a direct concept of "static classes" in the way that languages like C# do. 
	 * Instead, it has static nested classes, which are used to group related classes and provide encapsulation.
	 * 
	 */
	
	private static int value = 10;
	private static int value1 = 10;
	
	static class Inner { //Nested inner static class
		private int value = 5;
		public void printValue()
		{
			System.out.println(value);
		}
		public void printValue1()
		{
			System.out.println(value1); //static class can access only static variables
		}
	}
	
	public static void main(String[] args) {
		
		Inner inner = new Inner();
		inner.printValue(); //O/P is 5
		
		Inner se = new StaticExample.Inner(); //The outer class can access the static nested class directly
		se.printValue1(); //O/P is 10
		
		
	}

}
