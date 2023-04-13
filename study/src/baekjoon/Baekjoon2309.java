package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baekjoon2309 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int sum = 0;
		int[] arr = new int[9];
		for (int i = 0; i < 9; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
		}
		
		for (int i = 0; i < 8; i++) {
			for (int j = 1; j < 9; j++) {
				if(sum - arr[i] - arr[j] == 100) {
					arr[i] = 0;
					arr[j] = 0;
					
					Arrays.sort(arr);
					
					for (int k = 2; k < arr.length; k++) {
						System.out.println(arr[k]);
					}
					
					return;
				}
			}
		}
	}
}
