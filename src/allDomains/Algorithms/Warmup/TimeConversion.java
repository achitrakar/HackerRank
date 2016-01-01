package allDomains.Algorithms.Warmup;

import java.util.Scanner;

public class TimeConversion {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String time = scanner.nextLine();

		int hh, mm, ss;

		String timeFormat = time.substring(8);
		hh = Integer.parseInt(time.substring(0, 2));
		mm = Integer.parseInt(time.substring(3, 5));
		ss = Integer.parseInt(time.substring(6, 8));

		if (timeFormat.equalsIgnoreCase("PM")) {
			if (hh < 12 && hh >= 1) {
				hh += 12;
			}
		} else {
			if (hh == 12) {
				hh = 0;
			}
		}

		StringBuilder newTimeFormat = new StringBuilder()
				.append(String.format("%02d", hh)).append(":")
				.append(String.format("%02d", mm)).append(":")
				.append(String.format("%02d", ss));

		System.out.println(newTimeFormat);

		scanner.close();
	}
}
