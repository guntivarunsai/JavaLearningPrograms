package com.JODATimeDemo;

import java.time.LocalDate;
import java.time.LocalTime;

public class LocalDateDemo {

	public static void main(String[] args) {
		
		//LocalDate 
		LocalDate today = LocalDate.now();
		System.out.println(today);
		LocalTime ttime = LocalTime.now();
		System.out.println(ttime);
	}

}
