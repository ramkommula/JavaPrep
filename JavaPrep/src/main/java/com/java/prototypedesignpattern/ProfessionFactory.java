package com.java.prototypedesignpattern;

public class ProfessionFactory {
	
	public Profession getProfession(String profession)
	{
		if(profession == null)
		{
			return null;
		}
		if(profession.equalsIgnoreCase("Doctor"))
		{
			return new Doctor();
		}
		if(profession.equalsIgnoreCase("Engineer"))
		{
			return new Engineer();
		}
		if(profession.equalsIgnoreCase("Lawyer"))
		{
			return new Lawyer();
		}
		return null;
	}

}
