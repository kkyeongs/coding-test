package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Baekjoon10026 {
	static int[] dx = { 0, 1, 0, -1 };
	static int[] dy = { 1, 0, -1, 0 };
	static String[] aaaa = { "R", "G", "B" };
	static boolean[][] visited;
	static String[][] map;
	static int N;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());

		map = new String[N][N];
		for (int i = 0; i < N; i++) {
			String[] line = br.readLine().split("");

			for (int j = 0; j < N; j++) {
				map[i][j] = line[j];
			}
		}
		
		// 적록색약 아닌 사람
		visited = new boolean[N][N];
		int cnt = 0;
		for (int z = 0; z < aaaa.length; z++) {
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (!visited[i][j] && map[i][j].equals(aaaa[z]))
						cnt += BFS(i, j, aaaa[z]);
				}
			}
		}
		
		// 적록색약 사람 경우 
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if(map[i][j].equals("G")) map[i][j] = "R";
			}
		}
		
		visited = new boolean[N][N];
		int cnt2 = 0;
		for (int z = 0; z < aaaa.length; z++) {
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (!visited[i][j] && map[i][j].equals(aaaa[z]))
						cnt2 += BFS(i, j, aaaa[z]);
				}
			}
		}
		
		System.out.println(cnt + " " + cnt2);
	}

	private static int BFS(int i, int j, String aaaa) {
		visited[i][j] = true;

		Queue<int[]> queue = new LinkedList<int[]>();
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

				if (!visited[nx][ny] && aaaa.equals(map[nx][ny])) {
					visited[nx][ny] = true;
					queue.add(new int[] { nx, ny });
				}
			}
		}
		
		return 1;
	}
}
