package allDomains.Algorithms.Warmup;

import java.util.Scanner;

public class Staircase {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int height = scanner.nextInt();
		int numberOfSpaces = height - 1;

		for (int i = 0; i < height; i++) {
			for (int j = 0; j < height; j++) {
				if (j < numberOfSpaces) {
					System.out.print(" ");
				} else {
					System.out.print("#");
				}
			}
			numberOfSpaces--;
			System.out.println();
		}

		scanner.close();
	}
}
