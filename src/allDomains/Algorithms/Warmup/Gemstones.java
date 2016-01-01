package allDomains.Algorithms.Warmup;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Gemstones {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int loops = scanner.nextInt();

		int[] length = new int[loops];
		List<String> strList = new LinkedList<String>();
		String str;
		int minimum = 99999999;
		for (int i = 0; i < loops; i++) {
			str = scanner.nextLine();
			strList.add(str);
			if (length[i] < minimum) {
				minimum = length[i];
			}
			length[i] = str.length();
		}

		scanner.close();
	}
}
