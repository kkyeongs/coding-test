package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Baekjoon10773 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int K = Integer.parseInt(br.readLine());
		
		Stack<Integer> stack = new Stack<>();
		
		for (int i = 0; i < K; i++) {
			int N = Integer.parseInt(br.readLine());
			
			if(N != 0) {
				stack.push(N);
			} else {
				if(stack.isEmpty()) {
					break;
				} else {
					stack.pop();
				}
			}
		}
		
		System.out.println(stack.stream().reduce(0, Integer::sum));
	}
}