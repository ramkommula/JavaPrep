package com.java.DailyPractice.Object;


public class Player {
	
	private String name;
	private int score;
	private String type;
	
	public Player(String name, int score, String type) {
		super();
		this.name = name;
		this.score = score;
		this.type = type;
	}
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Player [name=" + name + ", score=" + score + ", type=" + type + "]";
	}
	
	

}
