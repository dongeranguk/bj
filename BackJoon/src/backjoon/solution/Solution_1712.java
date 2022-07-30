package backjoon.solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1712 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken()); // 고정 비용
		int B = Integer.parseInt(st.nextToken()); // 가변 비용
		int C = Integer.parseInt(st.nextToken()); // 노트북 가격
		

		if(C <= B) {
			System.out.println(-1);
		} else {
			System.out.println((A/(C-B)) + 1);
		}
	}
}
