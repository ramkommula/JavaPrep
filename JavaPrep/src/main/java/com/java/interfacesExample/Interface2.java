package com.java.interfacesExample;

public interface Interface2 {
	
	default void start()
	{
		System.out.println("In Interface - 02");
	}
	
	static boolean isNull()
	{
		System.out.println("check condition");
		return true;
	}

}
