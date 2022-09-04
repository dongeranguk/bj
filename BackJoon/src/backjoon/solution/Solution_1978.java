package backjoon.solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1978 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int cnt = 0;
		
		while(st.hasMoreTokens()) {
			boolean isPrime = true;
			int num = Integer.parseInt(st.nextToken());
			
			if(num == 1) {
				continue;
			}
			
			for(int i=2; i <= Math.sqrt(num); i++) {
				if(num % i == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}
}
