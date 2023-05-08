package programmers_hrd_course;

import java.util.Stack;

public class 올바른괄호개수 {
	public static void main(String[] args) {
		int n = 2;

		solution(n);
	}

	public static int solution(int n) {
		int answer = 0;

		Stack<int[]> stack = new Stack<>();
		stack.push(new int[] { 0, 0 });
		
		while (!stack.isEmpty()) {
			int[] z = stack.pop();
			int open = z[0], close = z[1];
			
			if (open > n || open < close)
				continue;
			
			if (open + close == 2 * n) {
				answer++;
				continue;
			}
			
			stack.push(new int[] { open + 1, close });
			stack.push(new int[] { open, close + 1 });
		}

		return answer;
	}
}
