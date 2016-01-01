package allDomains.Algorithms.Warmup;

import java.util.Scanner;

/**
 * 
 * @author Anup Chitrakar Jul 3, 2015
 * 
 *         2015
 * 
 *         SolveMeSecond.java
 */
public class SolveMeSecond {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int a, b;
		for (int i = 0; i < t; i++) {
			a = scanner.nextInt();
			b = scanner.nextInt();
			System.out.println(a + b);
		}
		scanner.close();

	}
}
