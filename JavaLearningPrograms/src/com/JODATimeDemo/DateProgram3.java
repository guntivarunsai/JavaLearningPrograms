package com.JODATimeDemo;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.Month;

public class DateProgram3 {

	public static void main(String[] args) {

		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);

		/*
		 * String date = dt.toString(); String[] dtime = date.split("T");
		 * System.out.println(dtime[0]); System.out.println(dtime[1]);
		 */

		LocalDateTime dt1 = LocalDateTime.of(1994, Month.NOVEMBER, 20, 11, 30);
		System.out.println(dt1);

		// find out the date and time from 6 months now
		System.out.printf("\n6 months from now : %s", dt.plusMonths(6));

		// 6 months back
		System.out.printf("\n6 months from before : %s", dt.minusMonths(6));

		// get the day of week for the curremt date and time
		DayOfWeek dw = dt.getDayOfWeek();
		// representing day of week with its name
		String s = dw.name();
		System.out.printf("%n Day of week name : %n%s", s);

		// represent day of week with integer value
		int n = dw.getValue();
		System.out.printf("%n Day of week value : %n%s", n);

	}
}
