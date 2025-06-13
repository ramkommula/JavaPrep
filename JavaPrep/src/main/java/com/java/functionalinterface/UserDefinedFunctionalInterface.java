package com.java.functionalinterface;

@FunctionalInterface
public interface UserDefinedFunctionalInterface {
	 void show();
}
//Functional Interface should have only one abstract method and can have multiple static & default methods
//Examples of pre-defined functional interfaces are
//1. Predicate-Test() method to filter the results - It returns true or false
//2. Function<T,R>-apply() method to calculate the data and give result - it takes input(T) and return result(R)
//3. Consumer is simply takes an input & performs operation & does not return result (it simply print the data)
//4. Supplier-get() method used to generate(supply) a random number without taking any input.
 