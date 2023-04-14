package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon27433 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		
		int[] arr = new int[N + 1];
		
		for (int i = 0; i < arr.length; i++) {
			if(i == 0) arr[i] = i;
			else if(i == 1)arr[i] = i;
			else arr[i] = arr[i - 1] + arr[i - 2];
		}
		
		System.out.println(arr[N]);
	}
}