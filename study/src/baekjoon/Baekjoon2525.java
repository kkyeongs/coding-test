package baekjoon;

import java.io.IOException;
import java.util.Scanner;

public class Baekjoon2525 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner in = new Scanner(System.in);

		int H = in.nextInt();
		int M = in.nextInt();
		int Z = in.nextInt();

		int totalMin = (60 * H) + M + Z;

		int hour = (totalMin / 60) % 24;
		int minute = totalMin % 60;

		System.out.println(hour + " " + minute);
	}
}