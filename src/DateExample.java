import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class DateExample {
	public static void main(String[] args) {
		// Input: Start Date - 31st March
		LocalDate startDate = LocalDate.of(2024, Month.MARCH, 31);

		// Duration: 1 month
		long durationMonths = 1;

		// Calculate end date
		LocalDate endDate = startDate.plus(durationMonths, ChronoUnit.MONTHS);

		startDate = startDate.plusMonths(durationMonths);
		System.out.println("LocalDate = " + startDate);
		Instant i = startDate.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant();
		System.out.println("java.util.Date = " + java.util.Date.from(i));

		// Output the result
		System.out.println("Start Date: " + startDate);
		System.out.println("End Date: " + endDate);
	}
}
