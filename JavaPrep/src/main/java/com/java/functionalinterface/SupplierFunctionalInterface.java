package com.java.functionalinterface;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierFunctionalInterface {
	
	public static void main(String[] args) {
		
		//Supplier functional interface is used when you want to supply or generate values without taking any input.
		Supplier<Integer> otpSupplier = () -> {
			Random r = new Random();
			return 100000 * r.nextInt(900000);
		};
		
		System.out.println("Generate OTP : " + otpSupplier.get());
	}

}
