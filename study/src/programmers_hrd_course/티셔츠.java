package programmers_hrd_course;

import java.util.Arrays;

public class 티셔츠 {
	public static void main(String[] args) {
		int[] people = { 2, 3 };
//		int[] people = {1, 2, 3};

		int[] tshirts = { 1, 2, 3 };
//		int[] tshirts = {1, 1};

		solution(people, tshirts);
	}

	public static int solution(int[] people, int[] tshirts) {
		int answer = 0;

		Arrays.sort(people);
		Arrays.sort(tshirts);

		int tshirtsIndex = tshirts.length - 1;
		int peopleIndex = people.length - 1;

		while (tshirtsIndex >= 0 && peopleIndex >= 0) {
			if (people[peopleIndex] <= tshirts[tshirtsIndex]) {
				answer++;
				tshirtsIndex--;
			}

			peopleIndex--;
		}

// 		int tshirtsIndex = tshirts.length - 1;

// 		for (int peopleIndex = people.length - 1; peopleIndex >= 0 && tshirtsIndex >= 0; peopleIndex--) {
// 			if (people[peopleIndex] <= tshirts[tshirtsIndex]) {
// 				answer++;
// 				tshirtsIndex--;
// 			}
// 		}

		System.out.println("answer -> " + answer);

		return answer;
	}
}
