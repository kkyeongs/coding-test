package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Baekjoon10828 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());

		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < N; i++) {
			String line = br.readLine();

			String order = line.split(" ")[0];

			if (order.equals("push")) {
				int num = Integer.parseInt(line.split(" ")[1]);
				stack.push(num);
			} else if (order.equals("pop")) {
				if(stack.isEmpty())
					sb.append(-1).append("\n");
				else
					sb.append(stack.pop()).append("\n");
			} else if (order.equals("size")) {
				sb.append(stack.size()).append("\n");
			} else if (order.equals("empty")) {
				if (stack.isEmpty())
					sb.append(1).append("\n");
				else
					sb.append(0).append("\n");
			} else if (order.equals("top")) {
				if(stack.isEmpty())
					sb.append(-1).append("\n");
				else
					sb.append(stack.peek()).append("\n");
			}
			
		}
		
		System.out.println(sb);
	}
}