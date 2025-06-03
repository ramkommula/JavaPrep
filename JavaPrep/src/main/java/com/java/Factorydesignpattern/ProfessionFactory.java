package com.java.Factorydesignpattern;

public class ProfessionFactory {
	
	public Profession getTypeOfProfession(String professionType)
	{
		if(professionType == null)
		{
			return null;
		}
		if(professionType.equalsIgnoreCase("doctor"))
		{
			return new Doctor();
		}
		if(professionType.equalsIgnoreCase("engineer"))
		{
			return new Engineer();
		}
		if(professionType.equalsIgnoreCase("teacher"))
		{
			return new Teacher();
		}
		
		return null;
	}

}
