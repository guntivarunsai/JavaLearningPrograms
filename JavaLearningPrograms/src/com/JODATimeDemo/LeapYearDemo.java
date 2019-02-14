package com.JODATimeDemo;

import java.time.Year;

public class LeapYearDemo {

	public static void main(String[] args) {
		
		int n=2016;
		
		//Create a Year class object with that year
		Year y = Year.of(n);
		
		//test if y is leap year or not
		
		boolean flag = y.isLeap();
		
		if(flag)
		{
			System.out.println(+n+" is a leap year");
		}
		else
		{
			System.out.println(+n+" is not a leap year");
		}
	}
}
