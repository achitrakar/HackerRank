package allDomains.Algorithms.Warmup;

import java.util.Scanner;

public class Pangrams {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();

		char[] smallAlphabets = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q',
				'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

		int flag = 0;
		for (int i = 0; i < 26; i++) {
			if (!str.contains(((smallAlphabets[i] + "")).toUpperCase()) && !str.contains((smallAlphabets[i] + ""))) {
				flag = 1;
				break;
			}
		}

		if (flag == 0) {
			System.out.println("pangram");
		} else {
			System.out.println("not pangram");
		}

		scanner.close();
	}
}
