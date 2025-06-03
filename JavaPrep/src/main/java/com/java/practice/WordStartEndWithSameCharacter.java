package com.java.practice;

import java.util.Arrays;
import java.util.List;

public class WordStartEndWithSameCharacter {
	
	
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("ana", "mno", "xyx", "abc", "opo");
		
		list.stream().filter(x -> x.length() > 0 && x.endsWith(String.valueOf(x.charAt(0)))).forEach(System.out::println);
	}
}
