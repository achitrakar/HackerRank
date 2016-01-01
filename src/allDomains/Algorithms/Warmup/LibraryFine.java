package allDomains.Algorithms.Warmup;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class LibraryFine {
	public static void main(String[] args) throws ParseException {
		Scanner scanner = new Scanner(System.in);

		Calendar actualDate = new GregorianCalendar();
		Calendar expectedDate = new GregorianCalendar();

		SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");

		Date date = sdf.parse(String.format("%02d", scanner.nextInt())
				+ String.format("%02d", scanner.nextInt())
				+ String.format("%02d", scanner.nextInt()));

		actualDate.setTime(date);

		date = sdf.parse(String.format("%02d", scanner.nextInt())
				+ String.format("%02d", scanner.nextInt())
				+ String.format("%02d", scanner.nextInt()));
		expectedDate.setTime(date);

		int numberOfDays = daysBetween(actualDate.getTime(),
				expectedDate.getTime());

		int fineAmount = 0;

		if (expectedDate.getTime().getYear() != actualDate.getTime().getYear()) {
			fineAmount = 10000;
		}

		if (numberOfDays >= 0) {
			fineAmount = 0;
		} else {
			if (expectedDate.getTime().getMonth() == actualDate.getTime()
					.getMonth()
					&& expectedDate.getTime().getYear() == actualDate.getTime()
							.getYear()) {
				fineAmount = -numberOfDays * 15;
			} else if (expectedDate.getTime().getMonth() != actualDate
					.getTime().getMonth()
					&& expectedDate.getTime().getYear() == actualDate.getTime()
							.getYear()) {
				fineAmount = 500 * (actualDate.getTime().getMonth() - expectedDate
						.getTime().getMonth());
			}
		}

		System.out.println(fineAmount);

		scanner.close();
	}

	public static int daysBetween(Date d1, Date d2) {
		return (int) ((d2.getTime() - d1.getTime()) / (1000 * 60 * 60 * 24));
	}
}
