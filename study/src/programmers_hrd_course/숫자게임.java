package programmers_hrd_course;

import java.util.Arrays;

public class 숫자게임 {

	public static void main(String[] args) {
		
		int[] A = {5, 1, 3, 7};
		int[] B = {2, 2, 6, 8};
		
		solution(A, B);
	}

	// 그리디
	private static int solution(int[] A, int[] B) {
		int answer = 0;
		
		Arrays.sort(A);
		Arrays.sort(B);
		
//		for (int i = 0; i < A.length; i++) {
//			for (int j = 0; j < B.length; j++) {
//				if(A[i] < B[j]) {
//					answer++;
//					B[j] = 0;
//					break; // B루프 종료
//				}
//			}
//		}
		
		System.out.println(Arrays.toString(A));
		System.out.println(Arrays.toString(B));
		
		int index = B.length - 1;
		for (int i = A.length - 1; i < A.length; i--) {
			if(A[i] < B[index]) {
				index--;
				answer++;
			}
		}
		
		return answer;
	}

	
}
