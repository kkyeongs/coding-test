package programmers;

import java.util.HashMap;
import java.util.Map;

public class 완주하지못한선수 {

	public static void main(String[] args) {
		String[] participant =  {"leo", "kiki", "eden"};
		String[] completion = {"eden", "kiki"};
		solution(participant, completion);
	}

	public static String solution(String[] participant, String[] completion) {
		String answer = "";
		
		Map<String, Integer> map = new HashMap<>();
		
		for (int i = 0; i < participant.length; i++) {
			String name = participant[i];
			
			if(map.containsKey(name)) map.replace(name, map.get(name) + 1);
			else map.put(name, 1);
		}
		
		for (int i = 0; i < completion.length; i++) {
			String name = completion[i];
			
			if(map.containsKey(name)) map.replace(name, map.get(name) - 1);
		}
		
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			String key = entry.getKey();
			Integer val = entry.getValue();
			
			if(val > 0) answer = key;
		}
		
        return answer;
	}
}
