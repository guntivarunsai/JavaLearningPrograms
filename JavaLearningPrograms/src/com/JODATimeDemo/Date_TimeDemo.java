package com.JODATimeDemo;

import java.time.LocalDate;
import java.time.LocalTime;

public class Date_TimeDemo {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now();
		
		int day = date.getDayOfMonth();
		
		System.out.println(day);
		
		int month = date.getMonthValue();
		
		System.out.println(month);
		
		int year = date.getYear();
		
		System.out.println(year);
		
		LocalTime time = LocalTime.now();
		
		int h = time.getHour();
		
		System.out.println(h);
		
		int m = time.getMinute();
		
		System.out.println(m);
		
		int s = time.getSecond();
		
		System.out.println(s);
		
		int n = time.getNano();
		
		System.out.println(n);
	}
}
