package allDomains.Algorithms.Sorting;

import java.util.Scanner;

public class InsertionSort1 {
	static int size;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		size = scanner.nextInt();
		int[] input = new int[size];
		for (int i = 0; i < size; i++) {
			input[i] = scanner.nextInt();
		}

		sort(input);

		scanner.close();
	}

	private static void sort(int[] input) {
		int temp = input[size - 1]; // last element is unsorted
		for (int i = size - 1; i >= 0; i--) {
			if (i == 0 || temp >= input[i - 1]) {
				// Boundary Conditions
				input[i] = temp;
				printArray(input);
				break;
			} else {
				input[i] = input[i - 1];
				printArray(input);
				continue;
			}
		}
	}

	private static void printArray(int[] input) {
		for (int j = 0; j < size; j++) {
			System.out.print(input[j] + " ");
		}
		System.out.println("");
	}
}
