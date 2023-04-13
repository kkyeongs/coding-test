package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Baekjoon10845 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());

		Queue<Integer> queue = new LinkedList<>();
		int last = 0;

		for (int i = 0; i < N; i++) {
			String line = br.readLine();

			String order = line.split(" ")[0];

			if (order.equals("push")) {
				last = Integer.parseInt(line.split(" ")[1]);
				queue.add(last);
			} else if (order.equals("pop")) {
				if (queue.isEmpty())
					sb.append(-1).append("\n");
				else
					sb.append(queue.poll()).append("\n");
			} else if (order.equals("size")) {
				sb.append(queue.size()).append("\n");
			} else if (order.equals("empty")) {
				if (queue.isEmpty())
					sb.append(1).append("\n");
				else
					sb.append(0).append("\n");
			} else if (order.equals("front")) {
				if (queue.isEmpty())
					sb.append(-1).append("\n");
				else
					sb.append(queue.peek()).append("\n");
			} else if (order.equals("back")) {
				if (queue.isEmpty())
					sb.append(-1).append("\n");
				else
					sb.append(last).append("\n");
			}
		}
		
		System.out.println(sb);
	}
}