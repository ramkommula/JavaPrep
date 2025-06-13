package com.java.functionalinterface;

public class FunctionalInterfaceExample {
	
public static void main(String[] args) {
		
		// Lambda expression implementing the 'show' method
		UserDefinedFunctionalInterface test = () -> {
			System.out.println("Printing show method from UserDefinedFunctionalInterface");
			
		};
		//This show() method will print text
		test.show();
	}

}
