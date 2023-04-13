package baekjoon;

import java.io.IOException;
import java.util.Scanner;

public class Baekjoon2753 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
	    
        int a = sc.nextInt();
    
        if((a % 4 == 0) && (a % 100 != 0 || a % 400 == 0)) {
            System.out.println("1");    
        } else {
            System.out.println("0");    
        }
	}
}