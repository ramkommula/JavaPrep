package com.java.interfacesExample;

public interface Interface1 {
	
	default void start()
	{
		System.out.println(" From Interface - 01");
	}
	
	static boolean isNull()
	{
		System.out.println("check condition");
		return true;
	}
	
	static boolean test(String str)
	{
		System.out.println("checking condition");
		return str != null ? true : false;
	}

}
