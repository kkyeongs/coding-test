package programmers_hrd_course;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class 상담예약제 {

	String name;
	int time;

	public 상담예약제(String time, String name) {
		this.time = parseTime(time);
		this.name = name;
	}

	public int parseTime(String time) {
		String[] times = time.split(":");
		return (Integer.parseInt(times[0]) * 60) + Integer.parseInt(times[1]);
	};

	public static void main(String[] args) {
		String[][] booked = { { "09:10", "lee" } };
		String[][] unbooked = { { "09:00", "kim" }, { "09:05", "bae" } };

		solution(booked, unbooked);
	}

	private static ArrayList<String> solution(String[][] booked, String[][] unbooked) {
//      String[] answer = {};
		ArrayList<String> answer = new ArrayList<>();

		Queue<상담예약제> bookQue = new LinkedList<>();
		Queue<상담예약제> unbookQue = new LinkedList<>();

		for (String[] book : booked) {
			bookQue.offer(new 상담예약제(book[0], book[1]));
		}

		for (String[] unbook : unbooked) {
			unbookQue.offer(new 상담예약제(unbook[0], unbook[1]));
		}

		int currentTime = Math.min(bookQue.peek().time, unbookQue.peek().time);

		while (!bookQue.isEmpty() || !unbookQue.isEmpty()) {
			if (bookQue.isEmpty()) {
				for (상담예약제 test : unbookQue)
					answer.add(test.name);
				break;
			}

			if (unbookQue.isEmpty()) {
				for (상담예약제 test : bookQue)
					answer.add(test.name);
				break;
			}

			상담예약제 books = bookQue.peek();
			상담예약제 unbooks = unbookQue.peek();

			if (currentTime >= books.time) {
				answer.add(bookQue.poll().name);
				currentTime += 10;
			} else if (currentTime >= unbooks.time) {
				answer.add(unbookQue.poll().name);
				currentTime += 10;
			} else {
				상담예약제 t;
				if (books.time < unbooks.time)
					t = bookQue.poll();
				else
					t = unbookQue.poll();

				answer.add(t.name);
				currentTime = t.time + 10;
			}
		}

		for (String name : answer) System.out.println(name);

		return answer;
	}
}
