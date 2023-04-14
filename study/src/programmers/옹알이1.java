package programmers;

public class 옹알이1 {

	public static void main(String[] args) {

		String[] babbling = {"aya", "yee", "u", "maa", "wyeoo"};
		String[] babbling2 = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};
		
		int answer = 0;
        
        for(int i = 0; i < babbling.length; i++) {
            String s = babbling[i];
            
            s = s.replaceFirst("aya", "0");
            s = s.replaceFirst("ye", "0");
            s = s.replaceFirst("woo", "0");
            s = s.replaceFirst("ma", "0");

            if(s.replaceAll("0", "").length() == 0) answer++;
        }    
            
        System.out.println(answer);
	}
}
