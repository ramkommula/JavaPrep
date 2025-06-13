package com.java.functionalinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateFunctionalInterface {
	
	public static void main(String[] args)
	{
		List<Employee> employeesList = new ArrayList<>();
		employeesList.add(new Employee("Vikram",70000));
		employeesList.add(new Employee("Umakanth",135000));
		employeesList.add(new Employee("Lakshman",88000));
		employeesList.add(new Employee("Mahadev",10000000));
		
		//Predicate<T> interface represents a condition(A boolean-valued function) that takes an input
		//and returns true or false based on the evaluation of the input.
		
		// Create a Predicate to check salary greater than 90000
		Predicate<Employee> salaryPredicate = (e) -> e.getSalary() > 90000;
		
		// Filter employees based on the salaryPredicate
		for(Employee emp : employeesList)
		{
			if(salaryPredicate.test(emp))
			{
				System.out.println("Employee salary more than 90000 is " + emp);
			}
		}
	}

}
