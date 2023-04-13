package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Baekjoon11047 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		Integer[] A = new Integer[N];
		for (int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(br.readLine());
		}

		Arrays.sort(A, Collections.reverseOrder());
		
		int cnt = 0;
		for (int i = 0; i < A.length; i++) {
			int m = K / A[i];
			
			if(m > 0) {
				cnt += m;
				K -= m * A[i];
			}
		}
		
		System.out.println(cnt);
	}
}