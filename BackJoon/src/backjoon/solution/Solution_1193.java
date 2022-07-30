package backjoon.solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_1193 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int X = Integer.parseInt(br.readLine());
		
		int cross_count = 1, prev_count_sum = 0;
		
		while(true) {
			
			if(X <= prev_count_sum + cross_count) {
				
				if(cross_count % 2 == 1) {
					System.out.println((cross_count - (X - prev_count_sum - 1)) + "/"  + (X - prev_count_sum));
					break;
				} else { // cross_count % 2의 결과가 1이 아니라면 (즉, 짝수라면)
					System.out.println((X - prev_count_sum) + "/" + (cross_count - (X - prev_count_sum - 1)));
					break;
				}
			} else {
				prev_count_sum += cross_count;
				cross_count++;
			}
		}
	}
}
