package com.java.practice;

public class Car {
	
	String color = "blue";

}

class Lambo extends Car {
	
	String color = "white";
	
	public void lambo() {
		System.out.println(super.color);
		System.out.println(this.color);
		System.out.println(color);
	}
	public static void main(String[] args) {
		
		Lambo lambo = new Lambo();
		
		lambo.lambo();
		
}
	
	
}
