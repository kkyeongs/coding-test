package programmers;

import java.util.Arrays;

public class 배열만들기2 {

	public static void main(String[] args) {
		int l = 5;
		int r = 555;

		solution(l, r);
	}

	public static int[] solution(int l, int r) {
		int[] answer = {};
		
		String result = "";
		while (l <= r) {
			String sl = String.valueOf(l);

			if (sl.replaceAll("0", "").replaceAll("5", "").equals("")) {
				result += l + ",";
			}
			l++;
		}
		
		if(result.equals("")) {
			answer = new int[1];
			answer[0] = -1;
			return answer;
		}
		
		String[] resultArr = result.substring(0, result.length() - 1).split(",");
		System.out.println(Arrays.toString(resultArr));
		
		answer = new int[resultArr.length];
		int idx = 0;
		for (String string : resultArr) {
			answer[idx] = Integer.parseInt(string);
			idx++;
		}
		
		return answer;
	}
}
