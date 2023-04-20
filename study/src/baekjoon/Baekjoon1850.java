package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon1850 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine(), " ");
		
		long a = Long.parseLong(st.nextToken());
		long b = Long.parseLong(st.nextToken());
		
		long x = gcb(a, b);
		
		for (int i = 0; i < x; i++) {
			sb.append(1);
		}
		
		System.out.println(sb);
	}
	
	private static long gcb(long a, long b) {
		long r = a % b;
		
		if(r == 0) return b;
		
		return gcb(b, r);
	}
}