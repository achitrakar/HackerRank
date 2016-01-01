package allDomains.Algorithms.BitManipulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class HammingDistance {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		String str = br.readLine();
		if (str.length() == num) {

			int queryCount = Integer.parseInt(br.readLine());

			List<String> queryList = new ArrayList<String>();

			for (int i = 0; i < queryCount; i++) {
				queryList.add(br.readLine());
			}

			for (String query : queryList) {
				char queryType = query.charAt(0);
				switch (queryType) {
				case 'C':
					str = cQuery(query, str);
					break;
				case 'S':
					str = sQuery(query, str);
					break;
				case 'R':
					str = rQuery(query, str);
					break;
				case 'W':
					System.out.println(wQuery(query, str));
					break;
				case 'H':
					System.out.println(hQuery(query, str));
					break;
				default:
					break;
				}
			}
		}
	}

	public static int getHammingDistance(String a, String b) {
		int hammingDistance = 0;
		if (a.length() == b.length()) {
			for (int i = 0; i < a.length(); i++) {
				if (a.charAt(i) != b.charAt(i)) {
					hammingDistance++;
				}
			}
		}
		return hammingDistance;
	}

	private static int hQuery(String query, String str) {
		String tokens[] = query.split(" ");
		String subString1 = str.substring(Integer.parseInt(tokens[1]) - 1,
				Integer.parseInt(tokens[1]) + Integer.parseInt(tokens[3]) - 1);
		String subString2 = str.substring(Integer.parseInt(tokens[2]) - 1,
				Integer.parseInt(tokens[2]) + Integer.parseInt(tokens[3]) - 1);

		return getHammingDistance(subString1, subString2);

	}

	private static String cQuery(String query, String str) {
		String tokens[] = query.split(" ");
		char character[] = str.toCharArray();
		for (int i = Integer.parseInt(tokens[1]) - 1; i <= Integer
				.parseInt(tokens[2]) - 1; i++) {
			if (tokens[3].charAt(0) == 'a' | tokens[3].charAt(0) == 'b')
				character[i] = tokens[3].charAt(0);
		}
		return new String(character);
	}

	private static String getReverse(String str) {
		StringBuilder reverse = new StringBuilder();
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse.append(str.charAt(i));
		}
		return reverse.toString();
	}

	private static String rQuery(String query, String str) {
		String tokens[] = query.split(" ");

		String beforeSubString = str.substring(0,
				Integer.parseInt(tokens[1]) - 1);
		String subString1 = str.substring(Integer.parseInt(tokens[1]) - 1,
				Integer.parseInt(tokens[2]));
		String afterSubString = str.substring(Integer.parseInt(tokens[2]),
				str.length());

		return beforeSubString + getReverse(subString1) + afterSubString;
	}

	private static String wQuery(String query, String str) {
		String tokens[] = query.split(" ");
		String subString = str.substring(Integer.parseInt(tokens[1]) - 1,
				Integer.parseInt(tokens[2]));
		return subString;
	}

	private static String sQuery(String query, String str) {
		String tokens[] = query.split(" ");

		String before = str.substring(0, Integer.parseInt(tokens[1]) - 1);
		String after = str.substring(Integer.parseInt(tokens[4]), str.length());

		String subStr1 = str.substring(Integer.parseInt(tokens[1]) - 1,
				Integer.parseInt(tokens[2]));
		String subStr2 = str.substring(Integer.parseInt(tokens[3]) - 1,
				Integer.parseInt(tokens[4]));

		return before.concat(subStr2).concat(subStr1).concat(after);
	}
}
