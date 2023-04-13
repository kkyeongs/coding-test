package baekjoon;

import java.io.IOException;
import java.util.Scanner;

public class Baekjoon2480 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner in = new Scanner(System.in);
		 
		int a, b, c;
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
 
		// 만약 모든 변수가 다른 경우
		if (a != b && b != c && a != c) {
			int max;
			if (a > b) {
				if (c > a) {
					max = c;
				} else {
					max = a;
				}
			}
			// b > a 라면	
			else {
				// c > b > a 라면
				if (c > b) {
					max = c;
				} else {
					max = b;
				}
			}
			System.out.println(max * 100);
		}
		// 적어도 한 쌍 이상의 서로 같은 변수가 존재할 경우
		else {
			// 3개의 변수가 모두 같은 경우
			if (a == b && a == c) {
				System.out.println(10000 + a * 1000);
			} else {
				// a가 b혹은 c랑만 같은 경우
				if(a == b || a == c) {
					System.out.println(1000 + a * 100);
 				} else {
					System.out.println(1000 + b * 100);
				}
			}
		}
	}
}
