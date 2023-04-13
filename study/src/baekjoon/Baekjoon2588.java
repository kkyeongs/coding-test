package baekjoon;

import java.io.IOException;
import java.util.Scanner;

public class Baekjoon2588 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		int a1 = (a / 100) * 100;
		int a2 = ((a % 100) / 10) * 10;
		int a3 = (a % 100) % 10;

		int b1 = (b / 100) * 100;
		int b2 = ((b % 100) / 10) * 10;
		int b3 = (b % 100) % 10;

		int c1 = (b / 100);
		int c2 = (b % 100) / 10;
		int c3 = (b % 100) % 10;

		int[] al = { a3, a2, a1 };
		int[] bl = { b3, b2, b1 };
		int[] cl = { c3, c2, c1 };

		int result = 0;
		for (int i = 0; i < 3; i++) {
			int aa = 0;
			int zz = 0;

			for (int j = 0; j < 3; j++) {
				aa += bl[i] * al[j];
				zz += cl[i] * al[j];
			}

			result += aa;
			System.out.println(zz);
		}

		System.out.println(result);
	}
}