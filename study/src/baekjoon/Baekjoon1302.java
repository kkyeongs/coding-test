package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Baekjoon1302 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		HashMap<String, Integer> map = new HashMap<>();
		
		for (int i = 0; i < N; i++) {
			String book = br.readLine();
			
			if(map.containsKey(book)) {
				map.replace(book, map.get(book) + 1);
			} else {
				map.put(book, 1);
			}
		}
		
		int max = 0;
		for (String key : map.keySet()) {
			max = Math.max(max, map.get(key));
		}
		
		ArrayList<String> keyList = new ArrayList<>(map.keySet());
		Collections.sort(keyList);
		
		String ans = "";
		for (String key : keyList) {
			if(max == map.get(key)) {
				ans = key;
				System.out.println(ans);
				break;
			}
		}
	}
}
