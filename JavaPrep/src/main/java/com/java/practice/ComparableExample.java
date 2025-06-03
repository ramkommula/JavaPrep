package com.java.practice;

public class ComparableExample implements Comparable{

	String name;
	int id;


//	@Override
//	public int compareTo(ComparableExample comparableExample) {
//		// TODO Auto-generated method stub
//		return (this.id < comparableExample.id) ? -1: 
//			(this.id > comparableExample.id) ? 1:0 ;
//	}
	
	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}

	
	

}
