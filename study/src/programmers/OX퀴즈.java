package programmers;

import java.util.Arrays;

public class OX퀴즈 {

	public static void main(String[] args) {
		String[] quiz = {"3 - 4 = -3", "5 + 6 = 11"};
		
		Solution(quiz);
	}

	private static String[] Solution(String[] quiz) {
		String[] answer = {};
		
		answer = new String[quiz.length];
		
		for (int i = 0; i < answer.length; i++) {
			String[] line = quiz[i].split(" ");
			
			int a = Integer.parseInt(line[0].trim());
			int b = Integer.parseInt(line[2].trim());
			int c = Integer.parseInt(line[4].trim());
			
			String d = line[1].trim();
			
			switch (d) {
			case "+":
				if(a + b == c) answer[i] = "O";
				else answer[i] = "X";
				break;
			case "-":
				if(a - b == c) answer[i] = "O";
				else answer[i] = "X";
				break;
			}
		}
		
		System.out.println(Arrays.toString(answer));
		
		return answer;
	}

}
