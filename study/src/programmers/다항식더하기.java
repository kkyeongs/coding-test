package programmers;

import java.util.Arrays;

public class 다항식더하기 {

	public static void main(String[] args) {
//		String polynomial = "3x + 7 + x";
		String polynomial = "1x + 15 + 0";
		
		Solution(polynomial);
	}

	private static String Solution(String polynomial) {
		String answer = "";
		
		String[] line = polynomial.split(" ");
		
		int a = 0;
		int ax = 0;
		
		for (int i = 0; i < line.length; i++) {
			String str = line[i].trim();
			
			if(str.equals("+")) continue;
			
			if(str.indexOf("x") > -1) {
				String s = str.replaceAll("x", "");
				
				int n = 0;
				
				if(s.equals("")) n = 1; 
				else n = Integer.parseInt(s);
				
				ax += n;
			} else {
				a += Integer.parseInt(str);
			}
		}
		
		if(a == 0) answer = ax + "x";
		else if(ax == 0) answer = String.valueOf(a);
		else answer = ax + "x + " + a;
		
 		if(ax == 1) answer = answer.replaceAll("1x", "x");
		
		return answer;
	}

}
