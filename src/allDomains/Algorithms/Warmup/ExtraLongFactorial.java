package allDomains.Algorithms.Warmup;

import java.math.BigInteger;
import java.util.Scanner;

public class ExtraLongFactorial {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num = scanner.nextInt();

		System.out.println(getFact(BigInteger.valueOf(num)));

		scanner.close();
	}

	private static BigInteger getFact(BigInteger num) {
		if (num.equals(BigInteger.valueOf(1))) {
			return BigInteger.valueOf(num.longValue());
		} else {
			num = num
					.multiply(getFact(BigInteger.valueOf(num.longValue() - 1)));
			return num;
		}
	}
}
