package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon1012 {
	static int[][] A;
	static boolean visited[][];
	static int cnt, T, M, N, K;
	static int[] dx = {0, -1, 0, 1};
	static int[] dy = {1, 0, -1, 0};
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		T = Integer.parseInt(br.readLine()); // 테스트케이스
		
		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			M = Integer.parseInt(st.nextToken()); // 배추밭 가로
			N = Integer.parseInt(st.nextToken()); // 배추밭 세로
			K = Integer.parseInt(st.nextToken()); // 배추 수
			
			A = new int[M][N];
			visited = new boolean[M][N];
			cnt = 0;
			
			for(int j = 0; j < K; j++) {
				st = new StringTokenizer(br.readLine(), " ");
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				
				A[x][y] = 1;
			}
			
			for (int x = 0; x < M; x++) {
				for (int y = 0; y < N; y++) {
					if(A[x][y] == 1 && !visited[x][y]) {
						DFS(x, y);
						cnt++;
					}
				}
			}
			
			System.out.println(cnt);
		}
	}
	
	public static void DFS(int x, int y) {
		visited[x][y] = true;
		
		for (int i = 0; i < 4; i++) {
			int cx = x + dx[i];
			int cy = y + dy[i];
			
			if(cx >= 0 && cy >= 0 && cx < M && cy < N) {
				if(!visited[cx][cy] && A[cx][cy] == 1) {
					DFS(cx, cy);
				}
			}
		}
	}
}
