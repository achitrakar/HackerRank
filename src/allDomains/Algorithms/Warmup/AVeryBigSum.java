package allDomains.Algorithms.Warmup;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * @author anup
 * 
 *         Jul 3, 2015
 * 
 *         2015
 * 
 * 
 *         AVeryBigSum.java
 */
public class AVeryBigSum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		List<Integer> inputList = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			inputList.add(scanner.nextInt());
		}

		long sum = 0;

		for (Integer integer : inputList) {
			sum += integer;
		}

		System.out.println(sum);

		scanner.close();
	}
}
