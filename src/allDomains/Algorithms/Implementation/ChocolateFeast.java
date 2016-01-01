package allDomains.Algorithms.Implementation;

import java.util.Scanner;

public class ChocolateFeast {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			System.out.println(Solve(in.nextInt(), in.nextInt(), in.nextInt()));
		}

		in.close();
	}

	private static long Solve(int N, int C, int M) {

		// Write code to solve each of the test over here
		int noOfChocolate = N / C;
		int noOfWrapper = noOfChocolate;
		while (noOfWrapper - M >= 0) {
			noOfWrapper = noOfWrapper - M;
			noOfChocolate++;
			noOfWrapper++;
		}
		return noOfChocolate;

		// 1
		// 6609 1 800
		// Actual: 12419
		// expected: 6617

	}
}
