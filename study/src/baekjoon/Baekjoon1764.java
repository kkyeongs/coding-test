package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Baekjoon1764 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		Set<String> setN = new HashSet<>();
		for (int i = 0; i < N; i++) {
			setN.add(br.readLine());
		}
		
		ArrayList<String> listM = new ArrayList<>();
		for (int i = 0; i < M; i++) {
			String name = br.readLine();
			if(setN.contains(name)) {
				listM.add(name);
			}
		}
		
		Collections.sort(listM);
		
		System.out.println(listM.size());
		for (String name : listM) {
			System.out.println(name);
		}
	}
}
