package in.DateTimeAPI;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.Year;
import java.time.ZoneId;

public class DateTime {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now();
		
		System.out.println("Current Date: " + date);
		
		
		int dd = date.getDayOfMonth();
		
		int mm = date.getMonthValue();
		
		int yy = date.getYear();
		
		System.out.println(dd + " " + mm + " " + yy);
		
		System.out.printf("Current Date: %d/%d/%d%n", dd, mm, yy);
		
		
		LocalTime time = LocalTime.now();
		
		System.out.println("Current Time: " + time);
		
		
		int hh = time.getHour();
		int min = time.getMinute();
		int ss = time.getSecond();
		int ns = time.getNano();
		System.out.printf("Current Time: %d:%d:%d.%d%n", hh, min, ss, ns);
		
		
		LocalDateTime dateTime = LocalDateTime.now();
		
		System.out.println("Current Date and Time: " + dateTime);
		
		LocalDate date1 = LocalDate.of(2023,04, 15);
		System.out.println("Specific Date: " + date1);
		
		LocalDateTime dateTime1 = LocalDateTime.of(2023, 04, 15, 10, 30, 45);
		
		System.out.println("Specific Date and Time: " + dateTime1);
		
		dateTime1 = dateTime1.plusDays(5);
		
		System.out.println("After adding 5 days: " + dateTime1);
		
		dateTime1 = dateTime1.minusHours(2);
		
		System.out.println("After subtracting 2 hours: " + dateTime1);
		
		
		dateTime1 = dateTime1.withYear(2024);
		
		System.out.println("After changing year to 2024: " + dateTime1);
		
		ZoneId systemZoneId = ZoneId.systemDefault();
		
		System.out.println("System Default Time Zone: " + systemZoneId);
		
		ZoneId zoneId = ZoneId.of("Asia/Kolkata");
		
		LocalDateTime dateTimeInZone = LocalDateTime.now(zoneId);
		
		System.out.println("Current Date and Time in " + zoneId + ": " + dateTimeInZone);
		
		LocalDateTime dateTimeInZone1 = LocalDateTime.now(ZoneId.of("America/New_York"));
		
		System.out.println("Current Date and Time in America/New_York: " + dateTimeInZone1);
		
		
		LocalDate date2 = LocalDate.now();
		
		LocalDate date3 = LocalDate.of(1997, 12, 13);
		
		Period period = Period.between(date3, date2);
		System.out.println("Period between " + date3 + " and " + date2 + ": " + period);
		
		
		int years = period.getYears();
		int months = period.getMonths();
		int days = period.getDays();
		System.out.printf("Years: %d, Months: %d, Days: %d%n", years, months, days);
		
		
		int i = Integer.parseInt(args[0]);
		
		Year year = Year.of(i);
		
		if (year.isLeap()) {
			System.out.println(i + " is a leap year.");
		} else {
			System.out.println(i + " is not a leap year.");
		}
		
		

	}

}
