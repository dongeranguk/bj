package backjoon.solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_2775 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		int k = 0;
		int n = 0;
		int cnt = 0;
		int[] down_stairs = {1, 2, 3};
		
		for(int i=0; i < T; i++) {
			k = Integer.parseInt(br.readLine());
			n = Integer.parseInt(br.readLine());
			int[] up_stairs = new int[n];
			
				for(int m=0; m < n; m++) {
					cnt += down_stairs[m];
					up_stairs[m] = down_stairs[m] + 1;
				}
			
			for(int result : down_stairs) {
				System.out.print("아래 층 : " + result);
				System.out.print(" ");
			}
			System.out.println();
			for(int result2 : up_stairs) {
				System.out.print(result2);
				System.out.print(" ");
			}
			
			System.out.println(cnt);
		}
		
	}
}
