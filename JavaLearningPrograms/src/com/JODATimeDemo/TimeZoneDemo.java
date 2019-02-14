package com.JODATimeDemo;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeZoneDemo {

	public static void main(String[] args) {

		// Time Zones

		ZoneId zone = ZoneId.systemDefault();
		System.out.printf("%nCurrent and TimeZone : %s", zone);

		// get the date and time in Los Angeles

		ZoneId la = ZoneId.of("America/Los_Angeles");
		ZonedDateTime zdt = ZonedDateTime.now(la);
		System.out.printf("%n Data and time in Los Angeles : %s", zdt);
	}
}
