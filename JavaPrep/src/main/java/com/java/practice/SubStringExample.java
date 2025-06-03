package com.java.practice;

public class SubStringExample {
	
	public static void main(String[] args) {
		
		String str = "path/newpath[abd|gs]ha"; //Expected output is "abd|gs"
		
		String result = str.substring(str.indexOf("[")+1,str.lastIndexOf("]"));
		System.out.println(result);
	}

}
