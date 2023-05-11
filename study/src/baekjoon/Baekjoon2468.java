package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baekjoon2468 {
	static int[] dx = { 0, 1, 0, -1 };
	static int[] dy = { 1, 0, -1, 0 };
	static boolean[][] visited;
	static int[][] map;
	static int cnt;
	static int N;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		N = Integer.parseInt(br.readLine());

		int maxHeight = 0;
		map = new int[N][N];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");

			for (int j = 0; j < N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				if (map[i][j] > maxHeight)
					maxHeight = map[i][j];
			}
		}

		int maxSafe = 0;
		for (int height = 0; height < maxHeight + 1; height++) {
			visited = new boolean[N][N];
			int safe = 0;

			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (!visited[i][j] && map[i][j] > height) {
						safe += BFS(i, j, height);
					}
				}
			}

			maxSafe = Math.max(maxSafe, safe);
		}

		System.out.println(maxSafe);
	}

	private static int BFS(int i, int j, int height) {
		visited[i][j] = true;
		Queue<int[]> queue = new LinkedList<>();
		queue.add(new int[] { i, j });

		while (!queue.isEmpty()) {
			int[] current = queue.poll();
			int x = current[0];
			int y = current[1];

			for (int k = 0; k < 4; k++) {
				int nx = x + dx[k];
				int ny = y + dy[k];

				if (nx < 0 || ny < 0 || nx > N - 1 || ny > N - 1)
					continue;

				if (!visited[nx][ny] && map[nx][ny] > height) {
					visited[nx][ny] = true;
					queue.add(new int[] { nx, ny });
				}
			}
		}

		return 1;
	}
}
