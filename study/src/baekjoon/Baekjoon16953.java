package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon16953 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] line = br.readLine().split(" ");
		
		int A = Integer.parseInt(line[0]);
		int B = Integer.parseInt(line[1]);
		
		int result = 1;
		
		while(B != A) {
			String stringB = String.valueOf(B);

			if(B < A) {
				result = -1;
				break;
			}
			
			if(B % 2 == 0) {
				B /= 2;
			} else if(stringB.endsWith("1")) {
				stringB = stringB.substring(0, stringB.length() - 1);
				B = Integer.parseInt(stringB);
			} else {
				result = -1;
				break;
			}
			
			result++;
		}
		
		System.out.println(result);
	}
}
