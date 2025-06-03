package com.java.practice;

import java.util.HashSet;
import java.util.Scanner;

public class FindDuplicateCharactersUsingHashSet {
	
	public static void main(String[] args) {
		
		//String str = "abcdab";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a String : ");
		
		String str = sc.next();
		
		char[] ch = str.toCharArray();
		
		HashSet<Character> set = new HashSet<>();
		
		for(Character c : ch)
		{
			if(set.contains(c))
			{
				System.out.println("Duplicate Character is " + c);
			}
			else {
				set.add(c);
			}
		}
	}

}
