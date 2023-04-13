package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baekjoon2606 {
	static int[][] A;
	static boolean[] visited;
	static int cnt;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		// 컴퓨터 수(노드)
		int N = Integer.parseInt(br.readLine());

		// 컴퓨터 쌍의 수(라인)
		int M = Integer.parseInt(br.readLine());

		A = new int[N + 1][N + 1];
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			A[a][b] = A[b][a] = 1;
		}

		visited = new boolean[N + 1];
		visited[1] = true;

		Queue<Integer> queue = new LinkedList<>();
		queue.add(1);

		cnt = 0;
		while (!queue.isEmpty()) {
			int num = queue.poll();

			for (int i = 1; i <= N; i++) {
				if (A[num][i] == 1 && !visited[i]) {
					visited[i] = true;
					queue.add(i);
					cnt++;
				}
			}
		}

		System.out.println(cnt);
	}

}