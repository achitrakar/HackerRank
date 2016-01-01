package allDomains.Algorithms.Implementation;

import java.util.Scanner;

public class Cavity {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int[][] input = new int[size][size];
		for (int i = 0; i < size; i++) {
			int j = 0;
			char[] str = scanner.next().toCharArray();
			for (char c : str) {
				input[i][j++] = Integer.parseInt("" + c);
			}
		}

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (i == 0 | j == 0 | i == size - 1 | j == size - 1) {
					System.out.print(input[i][j]);
				} else {
					if (input[i][j] > input[i - 1][j] && input[i][j] > input[i + 1][j] && input[i][j] > input[i][j + 1]
							&& input[i][j] > input[i][j - 1])
						System.out.print("X");
					else {
						System.out.print(input[i][j]);
					}
				}
			}
			System.out.println("");
		}

		scanner.close();
	}
}
