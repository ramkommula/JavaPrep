package com.java.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupWordsByLength {
	
	public static void main(String args[])
	{
		//Using String Array
		String str = "i have a sentences with technical words";
		
		String[] words = str.split("\\s");
		
		for(int i=0; i<words.length; i++)
		{
			for(int j=i+1; j<words.length; j++)
			{
				if(words[i].length() == words[j].length())
				{
					System.out.println(words[i].length() +" = " + words[i] + "," + words[j] );
				}
			}
		}
		
		//Using Stream
		
		//List<String> list = Arrays.asList("a", "have", 'a', "sentence", "words");
		List<String> listOfWords = new ArrayList<>();
		
		listOfWords.add("i");
		listOfWords.add("have");
		listOfWords.add("a");
		listOfWords.add("sentence");
		listOfWords.add("word");
		
		Map<Integer, List<String>> collectedWords =   listOfWords.stream().collect(Collectors.groupingBy(String::length));
		System.out.println(collectedWords);
	}

}
