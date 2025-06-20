package com.java.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertArrayOfStringsToUppercaseAndJoin {
	
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("USA", "canada", "INDIA", "Australia", "scotland", "russia");
		
		String convertedString = list.stream().map(x -> x.toUpperCase()).collect(Collectors.joining(", "));
		
		System.out.println(convertedString);
	}

}
