package com.java8.practice;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Set;


public class LocalDateDemo {

	public static void main(String[] args) {
		//LOCALDATE
		LocalDate localDate = LocalDate.now();
		System.out.println("localDate " + localDate);

		LocalDate localDate1 = LocalDate.of(2018, 10, 9);
		System.out.println("localDate1 " + localDate1);

		LocalDate tomorrow = LocalDate.now().plusDays(1);
		System.out.println("tomorrow " + tomorrow);

		LocalDate previousMonthSameDay = LocalDate.now().minus(1, ChronoUnit.MONTHS);
		System.out.println("previousMonthSameDay " + previousMonthSameDay);

		LocalDate previousWeekSameDay = LocalDate.now().minus(1, ChronoUnit.WEEKS);
		System.out.println("previousWeekSameDay " + previousWeekSameDay);

		LocalDate previousDay = LocalDate.now().minus(1, ChronoUnit.DAYS);
		System.out.println("previousDay " + previousDay);

		DayOfWeek sunday = LocalDate.parse("2018-12-18").getDayOfWeek();
		System.out.println("sunday " + sunday);

		int twelve = LocalDate.parse("2018-12-18").getDayOfMonth();
		System.out.println("twelve " + twelve);
		
		boolean leapYear = LocalDate.now().isLeapYear();
		System.out.println("leapYear " + leapYear);
		
		//LOCALTIME
		LocalTime now = LocalTime.now();
		System.out.println("now " + now);
		
		LocalTime sixThirty = LocalTime.parse("06:30");
		System.out.println("sixThirty " + sixThirty);
		
		LocalTime sevenThirty = LocalTime.parse("06:30").plus(1, ChronoUnit.HOURS);
		System.out.println("sixThirty " + sevenThirty);
		
		int six = LocalTime.parse("06:30").getHour();
		System.out.println("six " + six);
		
		int minute = LocalTime.parse("06:30").getMinute();
		System.out.println("minute " + minute);
		
		boolean isbefore = LocalTime.parse("06:30").isBefore(LocalTime.parse("07:30"));
		System.out.println("isbefore " + isbefore);
		
		LocalTime maxTime = LocalTime.MAX;
		System.out.println("maxTime " + maxTime);
		
		
		LocalTime minTime = LocalTime.MIN;
		System.out.println("minTime " + minTime);
		
		//LOCALDATETIME
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("localDateTime " + localDateTime);
		
		ZoneId zoneId = ZoneId.of("Indian/Maldives");
		System.out.println("zoneId " + zoneId);
		
		Set<String> allZoneIds = ZoneId.getAvailableZoneIds();
		System.out.println("allZoneIds " + allZoneIds);
		
		ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, zoneId);
		System.out.println("zonedDateTime " + zonedDateTime);
	}
}
