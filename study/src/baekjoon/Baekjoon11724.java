package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Baekjoon11724 {
	static ArrayList<Integer>[] A;
	static boolean[] visited;
	static int N, M;
	static int[] dx = { 0, 1, 0, -1 };
	static int[] dy = { 1, 0, -1, 0 };

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		A = new ArrayList[N + 1];
		visited = new boolean[N + 1];

		for (int i = 1; i < N + 1; i++) {
			A[i] = new ArrayList<>();
		}

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());

			A[start].add(end);
			A[end].add(start);
		}

		int cnt = 0;
		for (int i = 1; i < N + 1; i++) {
			if (!visited[i]) {
				cnt++;
				DFS(i);
			}
		}

		System.out.println(cnt);
	}

	private static void DFS(int v) {
		if (visited[v]) {
			return;
		}

		visited[v] = true;

		for (int i : A[v]) {
			if (!visited[i]) {
				DFS(i);
			}
		}
	}
}