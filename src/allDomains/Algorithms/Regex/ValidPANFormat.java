package allDomains.Algorithms.Regex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ValidPANFormat {
	public static void main(String[] args) {
		List<String> panList = new ArrayList<String>();

		Scanner scanner = new Scanner(System.in);

		int num = scanner.nextInt();

		for (int i = 0; i < num; i++) {
			panList.add(scanner.next());
		}

		scanner.close();

		String pattern = "^([A-Z]{5})([0-9]{4})([A-Z]{1})$";

		for (String pan : panList) {
			if (pan.matches(pattern)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}

	}
}
