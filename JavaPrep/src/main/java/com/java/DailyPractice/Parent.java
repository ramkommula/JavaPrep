package com.java.DailyPractice;

public class Parent {
	
	
	public void display()
	{
		System.out.println("aaaa");
	}


}
class Child extends Parent
{
	public void display()
	{
		System.out.println("bbbb");
	}
	
	public static void main(String[] args) {
		
		Parent p = new Child();
		p.display();
	}
	
	
}
