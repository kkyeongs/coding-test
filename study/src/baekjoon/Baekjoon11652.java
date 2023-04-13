package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Baekjoon11652 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		
		HashMap<Long, Integer> hm = new HashMap<>();
		
		for (int i = 0; i < N; i++) {
			long num = Long.parseLong(br.readLine());
			
			hm.put(num, hm.getOrDefault(num, 0) + 1);
		}
		
		int max = Integer.MIN_VALUE;
		long result = 0;
		
		for (long key : hm.keySet()) {
			if(hm.get(key) > max) {
				max = hm.get(key);
				result = key;
			} else if(hm.get(key) == max) {
				result = Math.min(result, key);
			}
		}
		
		System.out.println(result);
	}
}