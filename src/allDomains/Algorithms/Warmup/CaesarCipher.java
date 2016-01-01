package allDomains.Algorithms.Warmup;

import java.util.Scanner;

public class CaesarCipher {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int length = scanner.nextInt();
		String testString = scanner.next();
		int shiftOffset = scanner.nextInt();

		scanner.close();

		for (char ch : testString.toCharArray()) {
			if (((int) ch >= 'a' && (int) ch <= 'z')) {
				System.out
						.print((char) ('a' + ((ch - 'a') + shiftOffset) % 26));
			} else if (((int) ch >= 'A' && (int) ch <= 'Z')) {
				System.out
						.print((char) ('A' + ((ch - 'A') + shiftOffset) % 26));
			} else {
				System.out.print(ch);
			}
		}
	}
}
