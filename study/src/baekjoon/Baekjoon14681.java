package baekjoon;

import java.io.IOException;
import java.util.Scanner;

public class Baekjoon14681 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);

		int a, b;

		a = sc.nextInt();
		b = sc.nextInt();

		if (a > 0) {
			if (b > 0) {
				System.out.println("1");
			} else {
				System.out.println("4");
			}
		} else {
			if (b > 0) {
				System.out.println("2");
			} else {
				System.out.println("3");
			}
		}
	}
}