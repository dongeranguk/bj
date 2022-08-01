package backjoon.solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_2869 { // 시간 초과
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken()); // 낮동안 올라갈 수 있는 높이
		int B = Integer.parseInt(st.nextToken()); // 밤에 잠을 자는 동안 미끄러진 높이
		int V = Integer.parseInt(st.nextToken()); // 나무의 높이
		
		int h_sum = 0; // 올라간 총 높이
		int days = 0; // 정상까지 걸린 일수
		
		while(true) {
			days++;
			h_sum += A;
			if(h_sum >= V) { // 총 높이가 나무의 높이보다 높으면 
				System.out.println(days);
				break;
			} else { // 총 높이가 나무의 높이보다 낮으면
				h_sum -= B;
				continue;
			}
		}
		
	}
}
