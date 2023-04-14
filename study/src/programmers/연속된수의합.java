package programmers;

import java.util.Arrays;

public class 연속된수의합 {

	public static void main(String[] args) {
		int num = 5;
		int total = 5;
		
		// 등차수열
        int[] answer = new int[num];
        int nSum = num * (1 + num) / 2; // 15
        int start = (total - nSum) / num; // -2
        for (int i = 1; i <= num; i++) {
			answer[i - 1] = i + start;
		}
        
        System.out.println(Arrays.toString(answer));
	}

}
