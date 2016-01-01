package allDomains.Algorithms.Warmup;

import java.util.Scanner;

public class AngryProfessor {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numberOfStudents;
		int thresholdK;

		int loops;
		long positiveCount = 0;
		long negativeCount = 0;

		loops = scanner.nextInt();

		for (int l = 0; l < loops; l++) {
			negativeCount = 0;
			numberOfStudents = scanner.nextInt();
			thresholdK = scanner.nextInt();

			for (int i = 0; i < numberOfStudents; i++) {
				if (scanner.nextInt() <= 0) {
					negativeCount++;
				}
			}

			if ((negativeCount >= thresholdK)) {
				System.out.println("NO");
			} else {
				System.out.println("YES");
			}
		}

		scanner.close();
	}
}
