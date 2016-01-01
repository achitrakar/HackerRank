package allDomains.Algorithms.Regex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class SplitThePhoneNumbers {
	public static void main(String[] args) throws IOException {
		List<String> phoneNumberList = new ArrayList<String>();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String deliters = "-";

		int num = Integer.parseInt(br.readLine());

		for (int j = 0; j < num; j++) {
			String s = br.readLine();
			phoneNumberList.add(s);
		}

		for (String phoneNumber : phoneNumberList) {
			phoneNumber = phoneNumber.replace(" ", "-");
			String[] tokens = phoneNumber.split(deliters);
			System.out.print("CountryCode=" + tokens[0] + ",LocalAreaCode="
					+ tokens[1] + ",Number=" + tokens[2]);
			System.out.println();
		}
	}
}
