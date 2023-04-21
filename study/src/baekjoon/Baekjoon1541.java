package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baekjoon1541 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String line = br.readLine();
		
		String[] numLine = line.split("-");
		
		System.out.println(Arrays.toString(numLine));
		
		int sum = 0;
		for (int i = 0; i < numLine.length; i++) {
			String[] arr = numLine[i].split("\\+");
			
			int arrSum = 0;
			for (int j = 0; j < arr.length; j++) {
				arrSum += Integer.parseInt(arr[j]);
			}
			
			if(i == 0) {
				sum += arrSum;
			} else {
				sum -= arrSum;
			}
		}
		
		System.out.println(sum);
	}
}