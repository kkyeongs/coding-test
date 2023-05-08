package programmers_hrd_course;

public class 정수삼각형 {
	public static void main(String[] args) {
		int[][] triangle = {};

		solution(triangle);
	}

	public static int solution(int[][] triangle) {
		for (int i = triangle.length - 2; i >= 0; i--) {
			for (int j = 0; j < triangle[i].length; j++) {
				triangle[i][j] += Math.max(triangle[i + 1][j], triangle[i + 1][j + 1]);
			}
		}

		return triangle[0][0];
	}
}
