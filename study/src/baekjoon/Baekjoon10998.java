package baekjoon;

import java.io.IOException;
import java.util.Scanner;

public class Baekjoon10998 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);

		int a, b, result;

		a = Integer.parseInt(sc.next());
		b = Integer.parseInt(sc.next());

		result = a * b;
		System.out.println(result);
	}
}