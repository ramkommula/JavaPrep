package com.java.Factorydesignpattern;

public class MainFactory {
	
	public static void main(String[] args) {
		
		ProfessionFactory pf = new ProfessionFactory();
		Profession doc = pf.getTypeOfProfession("teacher");
		doc.print();
	}

}
