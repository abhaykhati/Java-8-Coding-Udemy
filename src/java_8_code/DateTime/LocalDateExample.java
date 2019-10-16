package java_8_code.DateTime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class LocalDateExample {

	public static void main(String[] args) {

		LocalDate localDate = LocalDate.now();
		System.out.println("localDate.now =  " + localDate);

		LocalDate of = LocalDate.of(2019, 010, 15);
		System.out.println("localDate.of=  " + of);

		System.out.println("Year Day Date " + LocalDate.ofYearDay(2018, 365));

		/**
		 * 
		 * Getting Values from Local Date
		 * 
		 */

		System.out.println("localDate.getMonth=  " + localDate.getMonth());

		System.out.println("localDate.getMonthValue=  " + localDate.getMonthValue());

		System.out.println("localDate.getDayOfWeek=  " + localDate.getDayOfWeek());

		System.out.println("localDate.getDayOfYear= " + localDate.getDayOfYear());

		System.out.println("localDate.getYear= " + localDate.getYear());

		System.out.println("Day of Month using get : " + localDate.get(ChronoField.DAY_OF_MONTH));

		System.out.println();
		/**
		 * 
		 * Modifying Values in Local Date
		 * 
		 */

		System.out.println("Plus Weeks  : " + localDate.plusWeeks(1));

		System.out.println("Plus Years : " + localDate.plusYears(1));

		System.out.println("Plus Days " + localDate.plusDays(1));

		System.out.println("Plus Months : " + localDate.plusMonths(1));

		System.out.println("Minus Months : " + localDate.minusMonths(1));

		System.out.println("Chrono Unit : " + localDate.minus(2, ChronoUnit.YEARS));

		System.out.println("With Year : " + localDate.withYear(2019));

		System.out.println("With Year Chrono Field : " + localDate.with(ChronoField.YEAR, 2019));

		System.out.println("With Temporal Adjusters : " + localDate.with(TemporalAdjusters.lastDayOfMonth()));

		System.out.println(
				"With Temporal Adjusters : " + localDate.with(TemporalAdjusters.dayOfWeekInMonth(1, DayOfWeek.FRIDAY)));
		
		System.out.println();
		// maps to the first friday of the week

		/**
		 * 
		 * Unsupported Scenarios
		 * 
		 */

		// System.out.println("Chrono Unit : " + localDate.minus(2, ChronoUnit.SECONDS));

		System.out.println("is Supported : " + localDate.isSupported(ChronoUnit.DAYS));
		
		System.out.println();
		
		/**
		 * 
		 * Additional Support Methods
		 * 
		 */

		System.out.println("Not a Leap Year : " + localDate.isLeapYear());

		LocalDate localDate2 = LocalDate.of(2020, 01, 31);

		System.out.println("Leap Year : " + localDate2.isLeapYear());

		System.out.println("isBefore : " + localDate.isBefore(localDate));

		System.out.println("isAfter : " + localDate.isAfter(localDate));

		System.out.println("isEqual : " + localDate.isEqual(localDate));

	}
}
