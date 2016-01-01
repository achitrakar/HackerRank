package allDomains.Algorithms.Implementation;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class MatrixRotation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> map = new LinkedHashMap();
		System.out.println("================================");
		for (int i = 0; i < 3; i++) {
			String s1 = sc.next();
			int x = sc.nextInt();
			map.put(s1, x);
		}
		
		

		System.out.println("================================");
	}

}
