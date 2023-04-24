package programmers_hrd_course;

import java.util.stream.IntStream;

public class 예산 {

	public static void main(String[] args) {
		
		int[] budgets = {120, 110, 140, 150};
		int M = 485;
		
		solution(budgets, M);
	}

	// 그리디
	private static int solution(int[] budgets, int M) {
		int answer = 0;
		int min = 0;
		int max = IntStream.of(budgets).max().orElse(0); // 150
		
		while(min <= max) {
			final int mid = (min + max) / 2;
			
			int sum = IntStream.of(budgets).map(n -> Math.min(n, mid)).sum();
			
			if(sum <= M) {
				min = mid + 1;
				answer = mid;
			} else {
				max = mid - 1;
			}
		}
		
		return answer;
	}

	
}
