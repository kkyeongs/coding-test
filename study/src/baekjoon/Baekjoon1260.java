package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baekjoon1260 {
	static boolean[] check;
	static int[][] map;
	static int N, M, V;
	static StringBuilder sb;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		sb = new StringBuilder();
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		V = Integer.parseInt(st.nextToken());
		
		map = new int[N + 1][N + 1];
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			map[a][b] = map[b][a] = 1;
		}
		
		check = new boolean[N + 1];
		DFS(V);
		
		sb.append("\n");
		check = new boolean[N + 1];
		BFS(V);
		
		System.out.println(sb.toString().trim());
	}
	
	static void DFS(int V) {
		check[V] = true;
		
		sb.append(V + " ");
		
		for (int i = 1; i <= N; i++) {
			if(map[V][i] == 1 && !check[i]) {
				DFS(i);
			}
		}
	}
	
	static void BFS(int V) {
		check[V] = true;
		
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(V);
		sb.append(V + " ");
		
		while (!queue.isEmpty()) {
			int num = queue.poll();
			
			for (int i = 1; i <= N; i++) {
				if(map[num][i] == 1 && !check[i]) {
					check[i] = true;
					queue.add(i);
					sb.append(i + " ");
				}
			}
		}
	}
}
