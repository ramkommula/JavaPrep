package com.java.functionalinterface;

public class Employee {
	
	private String name;
	private int salary;
	
	public Employee()
	{
		
	}
	
	public Employee(String name, int salary)
	{
		this.name = name;
		this.salary = salary;
	}

	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	
	public int getSalary()
	{
		return salary;
	}
	public void getSalary(int salary)
	{
		this.salary = salary;
	}
	
	public String toString()
	{
		return "Employee{name='" + name + "', salary=" + salary + "}";
	}
}
