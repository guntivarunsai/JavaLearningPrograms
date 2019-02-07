package com.enumerationsandAnnotations;
enum Days
{
	SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
}

public class DisplayEnum {

	public static void main(String[] args) {
	
		Days allDays[] = Days.values();
		
		System.out.println(Days.MONDAY);
	/*	for(Days d:allDays)
		{
			System.out.println(d);
		}*/
	}
}
