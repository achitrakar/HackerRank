package allDomains.Algorithms.Regex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class FindHackerRank {
	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<String> tweetList = new ArrayList<String>();

		int num = Integer.parseInt(br.readLine());

		for (int i = 0; i < num; i++) {
			tweetList.add(br.readLine());
		}

		String starts = "hackerrank(.*)";
		String ends = "(.*)hackerrank";

		for (String string : tweetList) {
			if (string.matches(starts) && string.matches(ends)) {
				System.out.println("0");
			} else if (string.matches(starts)) {
				System.out.println("1");
			} else if (string.matches(ends)) {
				System.out.println("2");
			} else {
				System.out.println("-1");
			}
		}
	}
}
