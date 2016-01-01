package allDomains.Algorithms.Warmup;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlusMinus {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int zeros = 0, positives = 0, negatives = 0;

		int n = scanner.nextInt();
		List<Integer> inputList = new ArrayList<Integer>();

		for (int i = 0; i < n; i++) {
			inputList.add(scanner.nextInt());
		}

		for (Integer integer : inputList) {
			if (integer == 0) {
				zeros++;
			} else if (integer < 0) {
				negatives++;
			} else {
				positives++;
			}
		}

		System.out.println(String.format("%.3f", (float) positives / n));
		System.out.println(String.format("%.3f", (float) negatives / n));
		System.out.println(String.format("%.3f", (float) zeros / n));

		scanner.close();
	}
}
