package backjoon.solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_2675 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int T = Integer.parseInt(st.nextToken());
		
		for(int i=0; i < T; i++) {
			String[] str = br.readLine().split(" ");
			
			int N = Integer.parseInt(str[0]);
			String S = str[1];
			
			for(int j=0; j < S.length(); j++) {
				for(int k=0; k < N; k++) {
					System.out.print(S.charAt(j));
				}
			}
			System.out.println();
		}
	}
}
