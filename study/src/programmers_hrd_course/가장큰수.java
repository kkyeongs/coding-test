package programmers_hrd_course;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class 가장큰수 {

	public static void main(String[] args) {
		
		int[] numbers = {2, 6, 10};
		
		solution(numbers);
	}

	// 그리디
	private static String solution(int[] numbers) {
		// 숫자 -> 문자 -> 내림차순 정렬 -> 조합
		String[] strNums = new String[numbers.length];
		
		for (int i = 0; i < numbers.length; i++) {
			strNums[i] = String.valueOf(numbers[i]);
		}
		
		// 오름차순 정렬
		// Arrays.sort(strNums) --> 내림차순(기본)
		Arrays.sort(strNums, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));
		
		String answer = "";
		
		for(String s : strNums) {
			answer += s;
		}
		
		if(answer.startsWith("0")) return "0";
		
		
		return answer;
	}

	// stream 사용
	private static String solution2(int[] numbers) {
		String answer = IntStream.of(numbers)
		.mapToObj(String::valueOf)
		.sorted((s1, s2) -> (s2 + s1).compareTo(s1 + s2))
		.collect(Collectors.joining());
		
		if(answer.startsWith("0")) return "0";
		
		return answer;
	}
	
}
