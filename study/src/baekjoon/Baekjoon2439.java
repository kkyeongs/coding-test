package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon2439 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int R = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= R; i++) {
			for (int j = R; j >= 1; j--) {
				if(i >= j) bw.write("*");
				else bw.write(" ");
				
				if(j == 1) bw.write("\n");
			}
		}
		br.close();
		
		bw.flush();
		bw.close();
	}
}
