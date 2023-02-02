package backjoon.solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2018_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int cnt = 1, start_index = 1, end_index = 1, sum = 1;
		
		while(end_index != N) {
			if(sum == N) {
				cnt++;
				end_index++;
				sum += end_index;
			} else if(sum > N) {
				sum -= start_index;
				start_index++;
			} else {
				end_index++;
				sum += end_index;
			}
		}
		
		System.out.println(cnt);
	}
}
