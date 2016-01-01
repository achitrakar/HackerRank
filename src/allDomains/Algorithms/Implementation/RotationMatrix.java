package allDomains.Algorithms.Implementation;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class RotationMatrix {

	static List<Integer> list = new ArrayList<Integer>();
	static int size = 0;

	public static void main(String[] args) {
		int rows;
		int cols;
		int noOfRotations;

		Scanner scanner = new Scanner(System.in);
		rows = scanner.nextInt();
		cols = scanner.nextInt();

		noOfRotations = scanner.nextInt();

		// constraint 1
		if ((rows < 2 || cols < 2) || (rows > 300 || cols > 300))
			return;

		// constraint 3
		if ((Math.min(rows, cols)) % 2 != 0) {
			return;
		}

		if (noOfRotations < 1 || noOfRotations > Math.pow(10, 9)) {
			return;
		}

		int[][] input = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				input[i][j] = scanner.nextInt();
				// constraint 4
				if (input[i][j] < 1 || input[i][j] > Math.pow(10, 8)) {
					return;
				}
			}
		}

		scanner.close();

		// Optimize Number of Rotation
		// List<Integer> listSizeCollection = new ArrayList<Integer>();
		// for (int i = 0; i < (rows < cols ? (rows / 2) : (cols / 2)); i++) {
		// //TODO: total number of elements in list needs to be optimized
		// listSizeCollection.add(arrayToList(input, rows, cols, i).size());
		// }

		input = rotateMatrix(rows, cols, input, noOfRotations);
		printArray(input);
	}

	private static double gcd(double a, double b) {
		if (b > a)
			return gcd(b, a);
		if (b == 0)
			return a;
		return gcd(b, a % b);
	}

	private static double lcm(double a, double b) {
		double k = gcd(a, b);
		a /= k;
		return a * b;
	}

	private static double getLcm(List<Integer> listSizeCollection) {

		double k = listSizeCollection.get(0);
		int n = listSizeCollection.size();
		n--;

		while (n >= 1) {
			k = lcm(k, listSizeCollection.get(n--));
		}
		return k;
	}

	private static int[][] rotateMatrix(int rows, int cols, int[][] input, int loop) {
		list.clear();

		for (int i = 0; i < (rows < cols ? (rows / 2) : (cols / 2)); i++) {

			list = arrayToList(input, rows, cols, i);
			size = loop % list.size();
			for (int j = 0; j < size; j++) {
				list = rotate(list);
			}

			input = listToArray(list, input, rows, cols, i);

		}
		return input;
	}

	private static void printArray(int[][] ar) {
		for (int[] is : ar) {
			for (int i : is) {
				System.out.print(i + " ");
			}
			System.out.println("");
		}
	}

	private static int[][] listToArray(List<Integer> list, int[][] rotatedArray, int maxRow, int maxCol, int offset) {
		if (maxCol - offset == 1) {
			for (int row = offset; row < maxRow - offset; row++) {
				rotatedArray[row][maxCol - offset - 1] = list.remove(0);
			}
		} else if (maxRow - offset == 1) {
			for (int col = offset; col < maxCol - offset; col++) {
				rotatedArray[maxRow - offset - 1][col] = list.remove(0);
			}
		} else {
			for (int col = offset; col < maxCol - offset; col++) {
				rotatedArray[offset][col] = list.remove(0);
			}
			// extract rightTop - rightBottom (ignore righttopCorner)
			for (int row = 1 + offset; row < maxRow - 1 - offset; row++) {
				rotatedArray[row][maxCol - offset - 1] = list.remove(0);
			}

			// extract BottomRight - BottomLeft
			for (int col = maxCol - 1 - offset; col >= offset; col--) {
				rotatedArray[maxRow - offset - 1][col] = list.remove(0);
			}

			// extract BottomLeft - topLeft (exclude topLeft)
			for (int row = maxRow - 2 - offset; row >= 1 + offset; row--) {
				rotatedArray[row][offset] = list.remove(0);
			}
		}
		return rotatedArray;
	}

	private static List<Integer> arrayToList(int[][] array, int maxRow, int maxCol, int offset) {
		List<Integer> arrayToList = new LinkedList<Integer>();
		// extract topLeft-topRight

		if (maxCol - offset == 1) {
			for (int row = offset; row < maxRow - offset; row++) {
				arrayToList.add(array[row][maxCol - offset - 1]);
			}
		} else if (maxRow - offset == 1) {
			for (int col = offset; col < maxCol - offset; col++) {
				arrayToList.add(array[maxRow - offset - 1][col]);
			}
		} else {
			for (int col = offset; col < maxCol - offset; col++) {
				arrayToList.add(array[offset][col]);
			}
			// extract rightTop - rightBottom (ignore righttopCorner)
			for (int row = 1 + offset; row < maxRow - 1 - offset; row++) {
				arrayToList.add(array[row][maxCol - offset - 1]);
			}

			// extract BottomRight - BottomLeft
			for (int col = maxCol - 1 - offset; col >= offset; col--) {
				arrayToList.add(array[maxRow - offset - 1][col]);
			}

			// extract BottomLeft - topLeft (exclude topLeft)
			for (int row = maxRow - 2 - offset; row >= 1 + offset; row--) {
				arrayToList.add(array[row][offset]);
			}
		}
		return arrayToList;
	}

	private static List<Integer> rotate(List<Integer> list) {
		int temp = list.remove(0);
		list.add(temp);
		return list;
	}
}
