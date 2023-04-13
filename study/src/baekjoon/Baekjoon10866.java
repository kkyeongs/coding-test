package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Baekjoon10866 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());

		Deque<Integer> deque = new LinkedList<>();

		for (int i = 0; i < N; i++) {
			String line = br.readLine();

			String order = line.split(" ")[0];

			if (order.equals("push_front")) {
				int num = Integer.parseInt(line.split(" ")[1]);
				deque.addFirst(num);
			} else if (order.equals("push_back")) {
				int num = Integer.parseInt(line.split(" ")[1]);
				deque.addLast(num);
			} else if (order.equals("pop_front")) {
				if (deque.isEmpty())
					sb.append(-1).append("\n");
				else
					sb.append(deque.pollFirst()).append("\n");
			} else if (order.equals("pop_back")) {
				if (deque.isEmpty())
					sb.append(-1).append("\n");
				else
					sb.append(deque.pollLast()).append("\n");
			} else if (order.equals("size")) {
				sb.append(deque.size()).append("\n");
			} else if (order.equals("empty")) {
				if (deque.isEmpty())
					sb.append(1).append("\n");
				else
					sb.append(0).append("\n");
			} else if(order.equals("front")) {
				if (deque.isEmpty())
					sb.append(-1).append("\n");
				else
					sb.append(deque.peekFirst()).append("\n");
			} else if(order.equals("back")) {
				if (deque.isEmpty())
					sb.append(-1).append("\n");
				else
					sb.append(deque.peekLast()).append("\n");
			}
		}
		
		System.out.println(sb);
	}
}