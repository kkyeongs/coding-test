package baekjoon;

import java.io.IOException;
import java.util.Scanner;

public class Baekjoon8393 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		int sum = 0;
		for (int i = 1; i <= a; i++) {
			sum += i;
		}

		System.out.println(sum);
	}
}