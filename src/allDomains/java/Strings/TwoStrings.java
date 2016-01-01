package allDomains.java.Strings;

import java.util.Scanner;

public class TwoStrings {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int loop = scanner.nextInt();

		for (int l = 0; l < loop; l++) {
			String A = scanner.next();
			String B = scanner.next();
			boolean hasSubString = false;

			if (A.length() < B.length()) {
				for (int i = 0; i < A.length(); i++) {
					if (B.contains("" + A.charAt(i))) {
						hasSubString = true;
						break;
					}
				}
			} else {
				for (int j = 0; j < B.length(); j++) {
					if (A.contains("" + B.charAt(j))) {
						hasSubString = true;
						break;
					}
				}
			}
			if (hasSubString) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}

		}

		scanner.close();
	}
}
