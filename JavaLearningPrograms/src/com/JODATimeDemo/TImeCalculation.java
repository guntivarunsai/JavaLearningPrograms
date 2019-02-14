package com.JODATimeDemo;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class TImeCalculation {

	public static void main(String[] args) {

		LocalDate today = LocalDate.now();
		LocalDate birthday = LocalDate.of(1994, Month.NOVEMBER, 20);

		Period p = Period.between(birthday, today);
		System.out.printf("You are %d years %d months and %d days older.", p.getYears(), p.getMonths(), p.getDays());

	}

}
