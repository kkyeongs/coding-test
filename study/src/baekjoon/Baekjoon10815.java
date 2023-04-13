package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon10815 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int[] arrN = new int[N];
		
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < arrN.length; i++) {
			arrN[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arrN);
		
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < M; i++) {
			int numM = Integer.parseInt(st.nextToken());
			
			if(Arrays.binarySearch(arrN, numM) > -1) {
				sb.append(1);
			} else {
				sb.append(0);
			}
			sb.append(" ");
		}
		
		System.out.println(sb);
	}
}