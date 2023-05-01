package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class K번째수 {

	public static void main(String[] args) {
		
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}}; 
		
		solution(array, commands);
	}

	// 배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구하려 합니다.
	public static int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
		
		for (int z = 0; z < commands.length; z++) {
			ArrayList<Integer> list = new ArrayList<>();

			int i = commands[z][0]; // 2, 4
			int j = commands[z][1]; // 5, 4
			int k = commands[z][2]; // 3, 1
			
			for (int idx = 0; idx < array.length; idx++) {
				if(idx < i - 1) continue;
				else if(idx > j - 1) continue;
				else list.add(array[idx]);
			}
			
			Collections.sort(list);
			
			int idx = 0;
			for (Integer num : list) {
				if(idx == k - 1) {
					answer[z] = num;
					break;
				}
				
				idx++;
			}
		}
		
		System.out.println(Arrays.toString(answer));
		
        return answer;
	}
}
