package allDomains.Algorithms.Warmup;

import java.util.Scanner;

public class FunnyString {

	public static void main(String[] args) {
		int flag = 0;
		Scanner scanner = new Scanner(System.in);
		int loop = scanner.nextInt();

		for (int j = 0; j < loop; j++) {
			flag = 0;
			String str = scanner.next();
			String reverse = new StringBuilder(str).reverse().toString();

			for (int i = 1; i < (str.length() - 1); i++) {
				flag = 0;
				if (calc(str.charAt(i + 1), str.charAt(i)) != calc(reverse.charAt(i + 1), reverse.charAt(i))) {
					flag = 1;
					break;
				}
			}

			if (flag == 0) {
				System.out.println("Funny");
			} else {
				System.out.println("Not Funny");
			}

		}
		scanner.close();
	}

	private static int calc(char x, char y) {
		return Math.abs(x - y);

	}
}
