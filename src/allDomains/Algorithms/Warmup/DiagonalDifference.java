package allDomains.Algorithms.Warmup;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * @author Anup Chitrakar
 * 
 *         Jul 3, 2015 2015
 * 
 *         DiagonalDifference.java
 */
public class DiagonalDifference {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();

		List<List<Integer>> inputArray = new ArrayList<List<Integer>>();

		for (int i = 0; i < n; i++) {
			List<Integer> row = new ArrayList<Integer>();
			for (int j = 0; j < n; j++) {
				row.add(scanner.nextInt());
			}
			inputArray.add(row);
		}

		int sumOfFirstDiag = 0, sumOfSecondDiag = 0;

		int i = 0;
		int j = n - 1;

		for (List<Integer> list : inputArray) {
			sumOfFirstDiag += list.get(i++);
			sumOfSecondDiag += list.get(j--);
		}
		System.out.println(getAbsoluteDifference(sumOfFirstDiag,
				sumOfSecondDiag));

		scanner.close();
	}

	private static int getAbsoluteDifference(int a, int b) {
		if (a < b) {
			return b - a;
		} else {
			return a - b;
		}
	}
}
