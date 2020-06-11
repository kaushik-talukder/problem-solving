package com.ezycoding.problemsolving.java8features;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;

public class DateTimeAPI {

	public static void main(String[] args) {
		
		//Date operations
		LocalDate date1 = LocalDate.now();
		System.out.println(date1);
		
		LocalDate date2 = LocalDate.of(2020, 12, 31);
		System.out.println(date2);
		
		LocalDate date3 = LocalDate.of(2020, Month.DECEMBER, 31);
		System.out.println(date3);
		
		LocalDate date4 = LocalDate.parse("12-31-2020", DateTimeFormatter.ofPattern("MM-dd-yyyy"));
		System.out.println(date4);
		
		LocalDate date5 = date4.minusWeeks(4);
		System.out.println(date5);
		System.out.println("==>"+date5.plus(1, ChronoUnit.CENTURIES));
		
		System.out.println(date5.getDayOfWeek());
		
		System.out.println(date3.isEqual(date4));
		
		//Time operations
		
		LocalTime time1 = LocalTime.now();
		System.out.println(time1);		
		
		LocalTime time2 = LocalTime.of(06, 21);
		System.out.println(time2);
		
		System.out.println(time1.getNano());
		
		// Date Time
		LocalDateTime dt1 = LocalDateTime.now();
		System.out.println(dt1);
		System.out.println(DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm a").format(dt1));
		
		//Zone Id
		Set<String> allZoneIds = ZoneId.getAvailableZoneIds();
		allZoneIds.stream().sorted().map(String::trim).forEach(System.out::println);
		
		ZoneId zid = ZoneId.of("Asia/Kolkata");
		ZonedDateTime zdt = ZonedDateTime.of(dt1, zid);
		System.out.println(zdt);
		
		
		//Period
		System.out.println(Period.between(date1, date2).getDays());
		System.out.println(ChronoUnit.YEARS.between(date1, date2));
		
		
		//Duration
		System.out.println(Duration.between(time2, time1).get(ChronoUnit.SECONDS));
		System.out.println(ChronoUnit.SECONDS.between(time2, time1));
		
		//Old Date
		System.out.println(new Date());
		System.out.println(new Date(Calendar.getInstance().getTimeInMillis()));
		System.out.println(new Date(System.currentTimeMillis()));
	}
}
