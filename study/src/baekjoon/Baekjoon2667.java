package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Baekjoon2667 {
	static int N;
	static int[][] A;
	static boolean visited[][];
	static int[] dx = {0, 1, 0, -1};
	static int[] dy = {1, 0, -1, 0}; 
	static int apartNum = 0;
	static int[] aparts;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		List<Integer> list = new ArrayList<>();
		
		N = Integer.parseInt(br.readLine());
		
		A = new int[N][N];
		visited = new boolean[N][N];
		
		for (int i = 0; i < N; i++) {
			String[] line = br.readLine().split("");
	
			for (int j = 0; j < N; j++) {
				A[i][j] = Integer.parseInt(line[j]);
			}
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if(A[i][j] == 1 && !visited[i][j]) {
					apartNum = 1;
					DFS(i, j);
					list.add(apartNum);
				}
			}
		}
		
		Collections.sort(list);
		
		System.out.println(list.size());
		for (Integer num : list) {
			System.out.println(num);
		}
	}
	
	private static void DFS(int x, int y) {
		visited[x][y] = true;
		
		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if(nx >= 0 && nx < N && ny >= 0 && ny < N) {
				if(A[nx][ny] == 1 && !visited[nx][ny]) {
					DFS(nx, ny);
					apartNum++;
				}
			}
		}
	}
}