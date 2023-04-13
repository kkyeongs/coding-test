package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Baekjoon9012 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			Stack<String> stack = new Stack<>();
			boolean is = true;

			String line = br.readLine();
			for (int j = 0; j < line.length(); j++) {
				String s = line.substring(j, j + 1);

				if (s.equals("("))
					stack.push(s);
				else if (s.equals(")")) {
					if(!stack.isEmpty()) {
						stack.pop();
					} else {
						is = false;
						break;
					}
				}
			}
			
			if(!stack.isEmpty()) is = false;
			
			if(is) System.out.println("YES");
			else System.out.println("NO");
		}
	}
}