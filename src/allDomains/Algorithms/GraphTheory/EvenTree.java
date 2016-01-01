package allDomains.Algorithms.GraphTheory;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class EvenTree {
	public static void main(String[] args) {
		int numberOfVertices;
		int numberOfEdeges;

		Scanner scanner = new Scanner(System.in);
		numberOfVertices = scanner.nextInt();
		numberOfEdeges = scanner.nextInt();

		int[][] input = new int[numberOfEdeges][2];

		Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
		Map<Integer, Integer> countMap = new HashMap<Integer, Integer>();

		for (int i = 0; i < numberOfEdeges; i++) {
			for (int j = 0; j < 2; j++) {
				input[i][j] = scanner.nextInt();
			}
			if (map.get(input[i][1]) == null) {
				List<Integer> list = new LinkedList<Integer>();
				list.add(input[i][0]);
				map.put(input[i][1], list);
			} else {
				map.get(input[i][1]).add(input[i][0]);
			}
		}

		printInput(input);

		System.out.println(">>>> MAP:: " + map);
		System.out.println("KeySet:: " + map.keySet());

		for (int key : map.keySet()) {
			countMap.put(key, 1);
			int childCount = 0;
			childCount = map.get(key).size();
			System.out.println("key " + key + ":: " + childCount);

		}

		scanner.close();
	}

	private static void printTree(int[][] input, int size) {

	}

	private static void printInput(int[][] input) {
		for (int[] is : input) {
			for (int i : is) {
				System.out.print(i + " ");
			}
			System.out.println("");
		}
	}
}
