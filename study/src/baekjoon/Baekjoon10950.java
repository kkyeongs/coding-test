package baekjoon;

import java.io.IOException;
import java.util.Scanner;

public class Baekjoon10950 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int[] arr = new int[a];

		for (int i = 0; i < a; i++) {
			int b = sc.nextInt();
			int c = sc.nextInt();

			arr[i] = b + c;
		}

		for (int i : arr) {
			System.out.println(i);
		}
	}
}