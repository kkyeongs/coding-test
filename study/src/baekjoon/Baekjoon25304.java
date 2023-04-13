package baekjoon;

import java.io.IOException;
import java.util.Scanner;

public class Baekjoon25304 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);

		int total = sc.nextInt();
		int i = sc.nextInt();

		int sum = 0;
		for (int j = 1; j <= i; j++) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			sum += a * b;
		}

		if (total == sum) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}