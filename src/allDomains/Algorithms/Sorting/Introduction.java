package allDomains.Algorithms.Sorting;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Introduction {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int valToSearch = scanner.nextInt();
		int arraySize = scanner.nextInt();
		List<Integer> input = new LinkedList<Integer>();
		for (int i = 0; i < arraySize; i++) {
			input.add(scanner.nextInt());
		}
		System.out.println(">> " + input.indexOf(valToSearch));
		scanner.close();
	}
}
