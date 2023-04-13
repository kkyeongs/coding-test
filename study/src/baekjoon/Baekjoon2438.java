package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon2438 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int R = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < R; i++) {
			for (int j = 0; j <= i; j++) {
				if(i == j) sb.append("*" + "\n");
				else sb.append("*");
			}
		}
		
		System.out.println(sb);
	}
}
