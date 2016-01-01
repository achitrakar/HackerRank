package allDomains.Algorithms.Warmup;

import java.util.Scanner;

import org.w3c.dom.Node;

public class AlternatingCharacters {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int loop = scanner.nextInt();
		String str;
		for (int i = 0; i < loop; i++) {
			str = scanner.next();
			int noOfDeletions = 0;
			for (int j = 0; j < str.length() - 1; j++) {
				if ((str.charAt(j) == 'A' && str.charAt(j + 1) != 'B')
						|| (str.charAt(j) == 'B' && str.charAt(j + 1) != 'A')) {
					noOfDeletions++;
				}
			}
			System.out.println(noOfDeletions);
		}
		scanner.close();
	}
}
