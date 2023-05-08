package programmers_hrd_course;

import java.util.LinkedList;
import java.util.Queue;

public class 게임맵최단거리 {
	int x, y;
	
	public 게임맵최단거리(int x, int y) {
        this.x = x;
        this.y = y;
	}
	
	boolean isValid(int width, int height) {
		if(x < 0 || x >= width) return false;
		if(y < 0 || y >= height) return false;
		return true;
	}

	public static void main(String[] args) {
		int[][] map = {{}};
		solution(map);
	}
	
    public static int solution(int[][] maps) {
        int answer = 0;

        int mapHeight = maps.length;
        int mapWidth = maps[0].length;

        Queue<게임맵최단거리> queue = new LinkedList<>();
        int[][] count = new int[mapHeight][mapWidth];
        boolean[][] visited = new boolean[mapHeight][mapWidth];

        queue.offer(new 게임맵최단거리(0, 0));
        count[0][0] = 1;
        visited[0][0] = true;

        while(!queue.isEmpty()) {
        	게임맵최단거리 current = queue.poll();

            int currentCount = count[current.y][current.x];

            final int[][] moving = {{0, -1}, {0, 1}, {-1, 0}, {1, 0}};
            for(int i = 0; i < moving.length; i++) {
            	게임맵최단거리 moved = new 게임맵최단거리(current.x + moving[i][0], current.y + moving[i][1]);
                
                if(!moved.isValid(mapWidth, mapHeight)) continue;
                if(visited[moved.y][moved.x]) continue;
                if(maps[moved.y][moved.x] == 0) continue;

                count[moved.y][moved.x] = currentCount + 1;
                visited[moved.y][moved.x] = true;
                queue.offer(moved);
            }
        }

        answer = count[mapHeight - 1][mapWidth - 1];
        if(answer == 0) return -1;

        return answer;
    }
}
