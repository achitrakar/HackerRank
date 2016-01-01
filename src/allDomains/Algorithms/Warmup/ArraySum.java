package allDomains.Algorithms.Warmup;

import java.util.Scanner;

public class ArraySum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int sum = 0;

		for (int i = 0; i < size; i++) {
			sum += scanner.nextInt();
		}

		System.out.println(sum);

		scanner.close();
	}
}
