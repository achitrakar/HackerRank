package allDomains.Algorithms.Regex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class HackerRankTweets {
	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<String> tweetList = new ArrayList<String>();

		int num = Integer.parseInt(br.readLine());

		for (int i = 0; i < num; i++) {
			tweetList.add(br.readLine());
		}
		String pattern = "(.*)hackerrank(.*)";
		int tweetCount = 0;

		for (String tweet : tweetList) {
			if (tweet.toLowerCase().matches(pattern)) {
				tweetCount++;
			}
		}
		System.out.println(tweetCount);
	}
}
