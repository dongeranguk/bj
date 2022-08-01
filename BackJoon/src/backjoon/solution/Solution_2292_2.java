package backjoon.solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_2292_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int cnt = 1;
		int a = 1;
		// 시작하는 방의 번호 : 2, 8, 20, 38
		// 끝나는 방의 번호 : 7, 19, 37, 61
		if(N == 1) {
			System.out.println(cnt);
		} else {
			cnt++;
			while(true) {
				if(N > cnt + (a * 6)) {
					cnt++;
					a++;
				} else {
					System.out.println(cnt);
					break;
				}
			}
		}
	}
}
