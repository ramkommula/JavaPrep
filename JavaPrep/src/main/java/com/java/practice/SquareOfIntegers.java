package com.java.practice;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SquareOfIntegers {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(2,3,4,5);
		
		list.stream().mapToInt(n -> n*n).forEach(System.out::println);
		IntStream a = list.stream().mapToInt(n -> n*n);
		
		System.out.println("--------------------");
		
		list.stream().mapToInt(n -> n*n).filter(n -> n>10).forEach(System.out::println);
		
		System.out.println("--------------------");
		
		OptionalDouble d = list.stream().mapToInt(n -> n*n).filter(n -> n>10).average();
		System.out.println(d.getAsDouble());
		
		System.out.println("--------------------");
		
		if(d.isPresent())
		{
			System.out.println(d.getAsDouble());
		}
		else {
			System.out.println("No Qualifying Element.");
		}
		
		
		
	}

}
