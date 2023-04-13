package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Baekjoon11286 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((o1, o2) -> {
            int abs1 = Math.abs(o1);
            int abs2 = Math.abs(o2);

            if(abs1 == abs2) return o1 > o2 ? 1 : -1;
            return abs1 - abs2;
        });
		
		int N = Integer.parseInt(br.readLine());

		while(N --> 0) {
			int num = Integer.parseInt(br.readLine());
			
			if(num != 0) {
				priorityQueue.add(num);
			} else {
				if(!priorityQueue.isEmpty()) {
					sb.append(priorityQueue.poll()).append("\n");
				} else {
					sb.append("0\n");
				}
			}
		}
		
		System.out.println(sb);
	}
}