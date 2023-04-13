package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Baekjoon10816 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		HashMap<Integer, Integer> hm = new HashMap<>();
		
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < N; i++) {
			int n = Integer.parseInt(st.nextToken());
			
			if(hm.containsKey(n)) {
				hm.replace(n, hm.get(n) + 1);
			} else {
				hm.put(n, 1);
			}
		}
		
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine(), " ");
		
		for (int i = 0; i < M; i++) {
			int m = Integer.parseInt(st.nextToken());
			int cnt = hm.get(m) != null ? hm.get(m) : 0;
			sb.append(cnt).append(" ");
		}
		
		System.out.println(sb);
	}
}