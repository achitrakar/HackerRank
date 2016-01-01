package allDomains.Algorithms.Implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GridSearch {
	private static boolean isFound = false;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int noOfInputs = scanner.nextInt();

		List<String> output = new ArrayList<String>();
		List<String> bigArray;
		List<String> smallArray;

		for (int i = 0; i < noOfInputs; i++) {
			bigArray = new ArrayList<String>();
			smallArray = new ArrayList<String>();

			int bigArrayRow, bigArrayCol;
			bigArrayRow = scanner.nextInt();
			bigArrayCol = scanner.nextInt();
			for (int row = 0; row <= bigArrayRow; row++) {
				String rowString = scanner.nextLine();
				// if (rowString.length() == bigArrayCol) {
				// bigArray.add(rowString);
				// } else {
				// bigArray.add("");
				// }
				bigArray.add(rowString);
			}

			int smallArrayRow, smallArrayCol;
			smallArrayRow = scanner.nextInt();
			smallArrayCol = scanner.nextInt();
			for (int row = 0; row <= smallArrayRow; row++) {
				String rowString = scanner.nextLine();
				// if (rowString.length() == smallArrayCol) {
				// smallArray.add(rowString);
				// } else {
				// smallArray.add("");
				// }
				smallArray.add(rowString);
			}

			bigArray.remove(0);
			smallArray.remove(0);

			boolean isFound = isAvailable(bigArray, smallArray);
			if (isFound) {
				output.add("YES");
			} else {
				output.add("NO");
			}

		}

		for (String string : output) {
			System.out.println(string);
		}
		scanner.close();
	}

	private static boolean isAvailable(List<String> bigArray, List<String> smallArray) {
		boolean isFound = false;
		int matchingIndex = -1;

		for (int i = 0; i < bigArray.size(); i++) {
			if (bigArray.get(i).contains(smallArray.get(0).trim())) {
				matchingIndex = bigArray.get(i).indexOf(smallArray.get(0).trim());
				int j = 1;
				for (j = 1; j < smallArray.size(); j++) {
					if (!(bigArray.get(i + j)
							.substring(matchingIndex, smallArray.get(0).trim().length() + matchingIndex)
							.equals(smallArray.get(j).trim()))) {
						isFound = false;
						break;
					} else {
						isFound = true;
					}
				}
			}
		}
		return isFound;
	}

}
