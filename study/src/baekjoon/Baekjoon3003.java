package baekjoon;

import java.io.IOException;
import java.util.Scanner;

public class Baekjoon3003 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);

		int k = sc.nextInt();
		int q = sc.nextInt();
		int l = sc.nextInt();
		int b = sc.nextInt();
		int n = sc.nextInt();
		int p = sc.nextInt();

		System.out.println((1 - k) + " " + (1 - q) + " " + (2 - l) + " " + (2 - b) + " " + (2 - n) + " " + (8 - p));
	}
}