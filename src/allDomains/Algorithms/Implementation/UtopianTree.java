package allDomains.Algorithms.Implementation;

import java.util.Scanner;

public class UtopianTree {
	public static void main(String[] args) {
		// Spring - double height
		// Summer - height increase by 1 meter.

		Scanner scanner = new Scanner(System.in);
		int loop = scanner.nextInt();
		int outputData[] = new int[loop];
		int height = 1; // in meters
		for (int i = 0; i < loop; i++) {
			int data = scanner.nextInt();
			height = 1;
			for (int j = 1; j <= data; j++) {
				if (j % 2 != 0) {
					height *= 2;
				} else {
					height++;
				}
			}
			System.out.println(height);
		}

		scanner.close();
	}
}
