package programmers;

import java.util.LinkedList;
import java.util.Queue;

public class 게임맵최단거리 {
	static int[][] maps = { { 1, 0, 1, 1, 1 }, { 1, 0, 1, 0, 1 }, { 1, 0, 1, 1, 1 }, { 1, 1, 1, 0, 1 }, { 0, 0, 0, 0, 1 } };
	static int[][] visited;

	static int[] dx = { 1, 0, -1, 0 };
	static int[] dy = { 0, 1, 0, -1 };

	public static void main(String[] args) {
		solution();
	}

	public static int solution() {
		visited = new int[maps.length][maps[0].length];

		bfs();
		
		int answer = visited[maps.length - 1][maps[0].length - 1];

		if (answer == 0)
			return -1;

		return answer;
	}

	static void bfs() {
		visited[0][0] = 1;

		Queue<int[]> queue = new LinkedList<>();
		queue.add(new int[] { 0, 0 });

		while (!queue.isEmpty()) {
			int[] now = queue.poll();
			int x = now[0];
			int y = now[1];
			
			for (int i = 0; i < 4; i++) {
				int xx = x + dx[i];
				int yy = y + dy[i];
				
				if(xx < 0 || xx > maps.length - 1 || yy < 0 || yy > maps[0].length - 1) continue;
				
				if(visited[xx][yy] == 0 && maps[xx][yy] == 1) {
					visited[xx][yy] = visited[x][y] + 1;
					queue.add(new int[] { xx, yy });
				}
			}
		}
		
		System.out.println(visited[maps.length - 1][maps[0].length - 1]);
	}
}
