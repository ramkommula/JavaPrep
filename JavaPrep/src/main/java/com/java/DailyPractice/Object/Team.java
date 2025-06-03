package com.java.DailyPractice.Object;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Team {
	
	public static void main(String[] args) {
		
		List<Player> list = new ArrayList<>();
		
		Player p1 = new Player("abc", 4, "Batsman");
		Player p2 = new Player("xyx", 24, "Batsman");
		Player p3 = new Player("pqr", 12, "Bowler");
		Player p4 = new Player("mno", 42, "Bowler");
		
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		
		//Displaying All Players with their Scores in Ascending order
		List<Player> ascScore = list.stream().sorted(Comparator.comparingInt(Player::getScore)).collect(Collectors.toList());
		System.out.println(ascScore);
		
		Map<String, List<Player>> ss = list.stream().collect(Collectors.groupingBy(Player::getType));
		
		//Sum of All Players Scores
		int sumofscores = list.stream().mapToInt(n -> n.getScore()).reduce(0, (a,b) -> a+b);
		System.out.println(sumofscores); //Output is 82
		
		
		//Grouping By Players Type
		Map<String, List<Player>> playersType = list.stream().collect(Collectors.groupingBy(Player::getType));
		System.out.println(playersType);
	}

}
