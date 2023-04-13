package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Baekjoon2161 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		Queue<Integer> q = new LinkedList<>();
		
		for (int i = 0; i < N; i++) {
			q.add(i + 1);
		}
		
		while(!q.isEmpty()) {
			System.out.println(q.poll());
			if(q.isEmpty()) {
				break;
			}
			
			q.add(q.poll());
		}
	}
}
