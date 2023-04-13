package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon1940 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		int[] A = new int[N];

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < A.length; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(A);

		int start = 0;
		int end = N - 1;
		int cnt = 0;

		// 1 2 3 4 5 7
		while (end > start) {
			int sum = A[start] + A[end];

			if (sum == M) {
				start++;
				end--;
				cnt++;
			} else if (sum > M) {
				end--;
			} else if (sum < M) {
				start++;
			}
		}

		System.out.println(cnt);
	}
}
