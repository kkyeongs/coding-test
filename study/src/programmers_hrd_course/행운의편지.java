package programmers_hrd_course;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class 행운의편지 {

	public static void main(String[] args) {
		int n = 8;
		int c = 3;
		int k = 2;
		int[][] contact = {};
//		Solution(n, c, k, contact);
	}

	class Citizen {
	    final boolean isBadBoy;
	    final List<Integer> contacts = new ArrayList<>();
	    int received = 0;

	    public Citizen(boolean isBadBoy) {
	        this.isBadBoy = isBadBoy;
	    }
	}

	class Solution {
	    public int solution(int n, int c, int k, int[][] contact) {
	        List<Citizen> citizens = new ArrayList<>();
	        for (int i = 0; i < n; i++) {
	            citizens.add(new Citizen(i < c));
	        }

	        for (int[] cont : contact) {
	            int sender = cont[0] - 1, receiver = cont[1] - 1;
	            citizens.get(sender).contacts.add(receiver);
	        }

	        Queue<Citizen> queue = new LinkedList<>();
	        citizens.stream().filter(z -> z.isBadBoy).forEach(queue::offer);

	        while (!queue.isEmpty()) {
	            Citizen cur = queue.poll();
	            for (int i : cur.contacts) {
	                Citizen receiver = citizens.get(i);
	                if (receiver.received == k) continue;

	                receiver.received += 1;
	                if (receiver.received == k) queue.offer(receiver);
	            }
	        }

	        int answer = 0;
	        for (Citizen citizen : citizens) {
	            if (citizen.isBadBoy) continue;
	            if (citizen.received == 0) answer += 1;
	        }
	        return answer;
	    }
	}
}
