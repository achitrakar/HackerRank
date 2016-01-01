package allDomains.Algorithms.Implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Encryption {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		scanner.close();
		str = str.replace(" ", "").trim();
		int length = str.length();
		int rows = (int) Math.floor(Math.sqrt(length));
		int cols = (int) Math.ceil(Math.sqrt(length));

		if (rows * cols < length) {
			rows += 1;
		}
		List<String> list = new ArrayList<String>();
		int k = 0;
		for (int i = 0; i < rows; i++) {
			String row = "";
			for (int j = 0; j < cols; j++) {
				if (k < length) {
					row += str.charAt(k);
					++k;
				} else {
					row += " ";
				}
			}
			System.out.println("row:: " + row);
			list.add(row);
		}

		List<String> result = new ArrayList<String>();

		for (int i = 0; i < cols; i++) {
			String row = "";
			for (int j = 0; j < list.size(); j++) {
				row += list.get(j).charAt(i);
			}
			System.out.println("result:: " + row);
			result.add(row.trim());
		}

		String output = "";
		for (String string : result) {
			output += string + " ";
		}
		System.out.println(output.trim());
	}
}
