package com.java.DailyPractice.Object;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Hospital {
	
	public static void main(String[] args) {
		
	
	Patient p1 = new Patient("xyz", 25, "Corona", 23000);
	Patient p2 = new Patient("mno", 34, "Fever", 2000);
	Patient p3 = new Patient("pqr", 19, "Corona", 30000);
	Patient p4 = new Patient("ghm", 55, "Corona", 17000);
	
	List<Patient> list = new ArrayList<>();
	
	list.add(p1);
	list.add(p2);
	list.add(p3);
	list.add(p4);
	
	List<Patient>  filteredList = list.stream().filter(x -> x.getDesaese() == "Corona" && x.getAge() > 25).collect(Collectors.toList());
	System.out.println(filteredList);

	double sveragingBillPaid = list.stream().filter(x -> x.getDesaese() == "Corona").collect(Collectors.averagingDouble(Patient::getAmount));
	System.out.println(sveragingBillPaid);
	}
	

}
