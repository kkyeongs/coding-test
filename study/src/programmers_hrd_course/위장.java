package programmers_hrd_course;

import java.util.Arrays;
import java.util.HashMap;

public class 위장 {
	public static void main(String[] args) {
		String[][] clothes = { { "yellow_hat", "headgear" }, { "blue_sunglasses", "eyewear" },
				{ "green_turban", "headgear" } };
//		String[][] clothes = {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoke_makeup", "face"}};
		solution2(clothes);
	}

	private static int solution(String[][] clothes) {
		int answer = 1;

		HashMap<String, Integer> hm = new HashMap<String, Integer>();

		for (String[] clothe : clothes) {
			String type = clothe[1];

			hm.put(type, hm.getOrDefault(type, 0) + 1);
		}

		for (Integer count : hm.values()) {
			answer = answer * (count + 1);
		}

		answer -= 1;

		if (answer == 0)
			return -1;

		return answer;
	}
	
	private static int solution2(String[][] clothes) {
		int answer = Arrays.stream(clothes)
			.map(t -> t[1])
			.distinct()
			.map(type -> (int) Arrays.stream(clothes).filter(t -> t[1].equals(type)).count())
			.map(t -> t + 1)
			.reduce(1, (subTotal, element) -> subTotal * element) - 1;
		
		System.out.println(answer);
		
		return answer;
	}
}
