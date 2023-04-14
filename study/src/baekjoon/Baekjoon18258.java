package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baekjoon18258 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		
		Queue<Integer> queue = new LinkedList<>();
		
		int lastNum = 0;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			String order = st.nextToken();
			
			switch (order) {
			case "push":
				lastNum = Integer.parseInt(st.nextToken());
				queue.add(lastNum);
				break;
			case "pop":
				if(queue.isEmpty()) sb.append("-1\n");
				else sb.append(queue.poll()).append("\n");
				break;
			case "size":
				sb.append(queue.size()).append("\n");
				break;
			case "empty":
				if(queue.isEmpty()) sb.append("1\n");
				else sb.append("0\n");
				break;
			case "front":
				if(queue.isEmpty()) sb.append("-1\n");
				else sb.append(queue.peek()).append("\n");
				break;
				
			case "back":
				if(queue.isEmpty()) sb.append("-1\n");
				else sb.append(lastNum).append("\n");
				break;
			}
		}
		
		System.out.println(sb);
	}
}