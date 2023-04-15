package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon2609 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine(), " ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		int x = gcb(a, b);
		int y = (a * b) / x;
		
		System.out.println(x);
		System.out.println(y);
	}
	
	private static int gcb(int a, int b) {
		int r = a % b;
		
		if(r == 0) return b;
		
		return gcb(b, r);
	}
}