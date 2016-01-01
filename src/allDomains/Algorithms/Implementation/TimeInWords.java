package allDomains.Algorithms.Implementation;

import java.util.Scanner;

public class TimeInWords {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String[] hoursMap = { "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven",
				"twelve" };
		String[] minutesMap = { "one minute", "two minutes", "three minutes", "four minutes", "five minutes",
				"six minutes", "seven minutes", "eight minutes", "nine minutes", "ten minutes", "eleven minutes",
				"twelve minutes", "thirteen minutes", "fourteen minutes", "fifteen minutes", "sixteen minutes",
				"seventeen minutes", "eighteen minutes", "nineteen minutes", "twenty minutes", "twenty one minutes",
				"twenty two minutes", "twenty three minutes", "twenty four minutes", "twenty five minutes",
				"twenty six minutes", "twenty seven minutes", "twenty eight minutes", "twenty nine minutes" };

		int hrs = scanner.nextInt();
		int minute = scanner.nextInt();

		StringBuilder output = new StringBuilder();

		if (minute == 0) {
			output.append(hoursMap[hrs - 1]).append(" o' clock");
		} else if (minute == 30) {
			output.append("half past ").append(hoursMap[hrs - 1]);
		} else if (minute > 0 && minute < 30) {
			if (minute == 15) {
				output.append("quarter past ").append(hoursMap[hrs-1]);
			} else {
				output.append(minutesMap[minute - 1]).append(" past ").append(hoursMap[hrs - 1]);
			}
		} else if (minute > 30 && minute < 60) {
			if (minute == 45) {
				output.append("quarter to " + hoursMap[hrs]);
			} else {
				minute = 60 - minute;
				output.append(minutesMap[minute - 1] + " to " + hoursMap[hrs]);
			}
		}

		System.out.println(output.toString());

		scanner.close();
	}
}
