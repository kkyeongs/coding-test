package programmers_hrd_course;

public class 기지국설치 {

	public static void main(String[] args) {
		
		int[] stations = {120, 110, 140, 150};
		int N = 11;
		int W = 1;
		
		solution(N, stations, W);
	}

	// 그리디
	private static int solution(int N, int[] stations, int W) {
		int answer = 0;
		
		int stationIndex = 0;
		int position = 1;
		
		while(position <= N) { 
			// 지금 내 위치가 기지국 범위 안에 있는가?
			if(stationIndex < stations.length && stations[stationIndex] - W <= position) { // 있다
				// 기지국 범위 탈출
				position = stations[stationIndex] + W + 1; // 해당 기지국 오른쪽 범위 + 1(탈출) 
				stationIndex += 1;
			} else { // 없다
				// 기지국 설치
				answer += 1;
				position += W * 2 + 1; // 기지국설치, 왼오범위(w * 2) + 다음위치(1)
			}
		}
		
		return answer;
	}
}
