package com.java.functionalinterface;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerFunctionalInterface {
	
	public static void main(String[] args) {
		
		List<String> listOfNames = List.of("Vikram","Vijay","Vishal");
		
		//Consumer interface takes an input and performs an operation but does not return a result
		Consumer<String> printName = (name) -> {
			System.out.println("Employee : " + name);
		};
		
		listOfNames.forEach(printName);
		
		//Apply Discount
		Consumer<Double> applyDiscount = (price) -> {
			System.out.println("Discounted Price : " + price * 0.9);
		};
		
		applyDiscount.accept(1000.0);
		
	}

}
