package baekjoon;

import java.io.IOException;
import java.util.Scanner;

public class Baekjoon2739 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		
		int i = sc.nextInt();
		
		for (int j = 1; j < 10; j++) {
			System.out.println(i + " * " + j + " = " + (i * j));
		}
	}
}