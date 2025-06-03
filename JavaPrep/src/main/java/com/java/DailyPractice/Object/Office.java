package com.java.DailyPractice.Object;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Office {

	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<>();
		
		Employee e1 = new Employee("xyz", 25, 12000);
		Employee e2 = new Employee("mno", 22, 11000);
		Employee e3 = new Employee("pqr", 32, 34000);
		Employee e4 = new Employee("efg", 24, 13000);
		Employee e5 = new Employee("klm", 45, 42000);
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		
		List<Employee> filteredList = list.stream().map(e -> {
			if(e.getAge() > 25)
			{
				e.setSalary(e.getSalary() * 1.10);
			}
			return e;
		}).collect(Collectors.toList());
		
		System.out.println(filteredList);
	}
}
