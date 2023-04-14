package programmers;

import java.util.Stack;

public class 같은숫자는싫어 {

	public static void main(String[] args) {
//		int[] arr = {1,1,3,3,0,1,1};
		int[] arr = {4,4,4,3,3};
		
		int[] answer = {};
		
		Stack<Integer> stack = new Stack<>();
		
		for (int i = 0; i < arr.length; i++) {
			if(i == 0) {
				stack.add(arr[i]);
				continue;
			}
			
			if(stack.peek() == arr[i]) {
				continue;
			}
			
			stack.add(arr[i]);
		}
		
		answer = new int[stack.size()];
		
		int cnt = 0;
		for (Integer integer : stack) {
			answer[cnt] = integer;
			cnt++;
		}
		
		System.out.println(stack);
	}

}
