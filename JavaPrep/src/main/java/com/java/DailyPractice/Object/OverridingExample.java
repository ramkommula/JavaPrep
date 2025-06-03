package com.java.DailyPractice.Object;

public class OverridingExample {
	
	public static void main(String[] args) {
		
		A a = new B();
		a.print();
		
		//a.display(); //The method display() is undefined for the type A
		
	}

}
class A {
	void print()
	{
		System.out.println("Parent Class");
	}
}
class B extends A {
	void print()
	{
		System.out.println("Child Class");
	}
	void display()
	{
		System.out.println("error");
	}
}