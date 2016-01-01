package allDomains.Algorithms.Implementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CutSticks {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int loops = scanner.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < loops; i++) {
			list.add(scanner.nextInt());
		}

		int min = 0;

		while (list.size() != 0) {
			List<Integer> tempList = new ArrayList<Integer>();
			System.out.println(list.size());
			min = Collections.min(list);
			for (Integer integer : list) {
				if (integer != min) {
					tempList.add((integer - min));
				}
			}
			list.clear();
			list = tempList;
		}

		scanner.close();
	}
}
