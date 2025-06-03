package com.java.practice.functionalinterface;

import java.util.function.Function;

public class FunctionFunctionalInterface {
	
	public static void main(String[] args)
	{
		int salary = 70000;
		//Function<T,R> interface takes an input(T) and returns a Result(R)
		Function<Integer, Double> calculateSalary = (s) -> {
			return s * 0.1;
		};
		String result = String.valueOf(calculateSalary.apply(salary));
		System.out.println(result);
	}

}
