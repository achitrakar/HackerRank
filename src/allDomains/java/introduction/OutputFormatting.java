package allDomains.java.introduction;

import java.util.Scanner;

public class OutputFormatting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("================================");
		for (int i = 0; i < 3; i++) {
			String s1 = sc.next();
			int x = sc.nextInt();
			int noOfSpaces = 15 - s1.length();
			String text = s1;
			for (int j = 0; j < noOfSpaces; j++) {
				text += " ";
			}
			System.out.print(text);
			System.out.println(String.format("%03d", x));
		}
		System.out.println("================================");
	}
}
