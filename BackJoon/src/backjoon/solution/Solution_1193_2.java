package backjoon.solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_1193_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int X = Integer.parseInt(br.readLine());	
		
		int cross_count = 1; // 대각선에 위치한 칸의 갯수
		int prev_count_sum = 0; // 해당 대각선 직전까지의 칸의 갯수
		
		while(true) {
			if(X <= prev_count_sum + cross_count) { // X가 합보다 작거나 같으면 그 위치를 알 수 있으므로
				if(cross_count % 2 == 1) {
					System.out.println((cross_count - (X - prev_count_sum - 1) + "/" + (X - prev_count_sum)));
					break;
				} else {
					System.out.println((X - prev_count_sum) + "/" + (cross_count - (X - prev_count_sum - 1)));
					break;
				}
			} else { // X가 합보다 크거나 같으면
				prev_count_sum += cross_count; // 해당 대각선 직전까지의 칸의 갯수를 더한다.
				cross_count++; // 대각선에 위치한 칸의 갯수가 하나씩 늘어나므로
			}
		}
		
	}
}
