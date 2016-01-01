package allDomains.java.introduction;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaLoops {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numberOfTestCases = scanner.nextInt();
		int a, b, n;
		List<String> result = new ArrayList<String>();
		for (int i = 0; i < numberOfTestCases; i++) {
			String output = "";
			a = scanner.nextInt();
			b = scanner.nextInt();
			n = scanner.nextInt();

			int sum = 0;
			int val = 0;
			for (int x = 0; x < n; x++) {
				sum = 0;
				for (int y = 0; y <= x; y++) {
					sum += ((int) Math.pow(2, y)) * b;
				}
				val = a + sum;
				output += "" + val + " ";
			}
			output.trim();
			result.add(output);
		}
		scanner.close();

		for (String string : result) {
			System.out.println(string);
		}
	}
}
