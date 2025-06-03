package com.java.DailyPractice.Object;

public class Patient {
	
	private String name;
	private int age;
	private String desaese;
	private double amount;
	
	
	
	public Patient(String name, int age, String desaese, double amount) {
		super();
		this.name = name;
		this.age = age;
		this.desaese = desaese;
		this.amount = amount;
	}
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDesaese() {
		return desaese;
	}
	public void setDesaese(String desaese) {
		this.desaese = desaese;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Patient [name=" + name + ", age=" + age + ", desaese=" + desaese + ", amount=" + amount + "]";
	}
	
	

}
