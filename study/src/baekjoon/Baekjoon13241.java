package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon13241 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine(), " ");
		long a = Integer.parseInt(st.nextToken());
		long b = Integer.parseInt(st.nextToken());
		
		long x = gcb(a, b);
		long r = (a * b) / x;
		
//		System.out.println(x);
		System.out.println(r);
	}
	
	private static long gcb(long a, long b) {
		long r = a % b;
		
		if(r == 0) return b;
		
		return gcb(b, r);
	}
}