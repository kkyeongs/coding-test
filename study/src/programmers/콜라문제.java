package programmers;

public class 콜라문제 {

	public static void main(String[] args) {
		int a = 2;
		int b = 1;
		int n = 20;
		
		Solution(a, b, n);
	}

	private static int Solution(int a, int b, int n) {
		int answer = 0;
		
		while (n / a > 0) {
			answer += (n / a) * b;
			n = (n / a) * b + (n % a);
		}
		
		return answer;
	}

}
