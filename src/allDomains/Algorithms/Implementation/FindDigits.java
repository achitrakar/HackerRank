package allDomains.Algorithms.Implementation;

import java.util.Scanner;

public class FindDigits {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int loops = scanner.nextInt();
		int count = 0;
		for (int i = 0; i < loops; i++) {
			count = 0;
			String str = scanner.next();
			Double d = Double.parseDouble(str);
			for (int j = (str.length() - 1); j >= 0; j--) {
				int x = Integer.parseInt("" + str.charAt(j));
				if (d % x == 0) {
					count++;
				}
			}
			System.out.println(count);
		}

		scanner.close();
	}
}
