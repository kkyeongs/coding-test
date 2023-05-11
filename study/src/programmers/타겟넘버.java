package programmers;

public class 타겟넘버 {
	int[] numbers = {1, 1, 1, 1, 1};
	int target = 3; 
	static int answer;
	
	public int solution() {
		answer = 0;
		
		dfs(0, 0);
		
        return answer;
	}
	
	void dfs(int index, int sum) {
		// 1. 탈출 조건
		if(index == numbers.length) {
			if(sum == target) answer++;
			return;
		};
		
		// 2. 수행 동작
		dfs(index + 1, sum + numbers[index]);
		dfs(index + 1, sum - numbers[index]);
	}
}
