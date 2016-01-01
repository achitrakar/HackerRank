package allDomains.Algorithms.Implementation;

import java.util.Scanner;

import javax.xml.transform.Templates;

public class ACMICPCTeam {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int noOfPeople = scanner.nextInt();
		int noOfTopics = scanner.nextInt();

		int input[][] = new int[noOfPeople][noOfTopics];

		for (int i = 0; i < noOfPeople; i++) {
			int j = 0;
			char[] str = scanner.next().toCharArray();
			for (char c : str) {
				input[i][j++] = Integer.parseInt("" + c);
			}
		}
		scanner.close();
		int tempTopicCount = 0, temCount = 0, maxTopics = 0;

		for (int i = 0; i < noOfPeople; i++) {
			for (int j = i + 1; j < noOfPeople; j++) {
				tempTopicCount = 0;
				for (int k = 0; k < noOfTopics; k++) {
					if (Integer.parseInt("" + input[i][k]) == 1 || Integer.parseInt("" + input[j][k]) == 1) {
						tempTopicCount++;
					}
				}
				if (tempTopicCount > maxTopics) {
					maxTopics = tempTopicCount;
					temCount = 1;
				} else if (tempTopicCount == maxTopics) {
					temCount++;
				}
			}
		}
		System.out.println(maxTopics);
		System.out.println(temCount);
	}
}
