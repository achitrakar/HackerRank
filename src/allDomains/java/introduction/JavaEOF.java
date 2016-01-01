package allDomains.java.introduction;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaEOF {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String nextLine = "";
		List<String> list = new ArrayList<String>();
		while (scanner.hasNextLine()) {
			nextLine = scanner.nextLine();
			list.add(nextLine);
		}

		int lineNumber = 1;
		for (String string : list) {
			System.out.println(lineNumber++ + " " + string);
		}
		scanner.close();

	}
}
