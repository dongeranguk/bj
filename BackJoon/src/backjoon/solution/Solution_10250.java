package backjoon.solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_10250 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		int H = 0;
		int W = 0;
		int N = 0;
		
		for(int i=0; i<T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			H = Integer.parseInt(st.nextToken()); // 층수
			W = Integer.parseInt(st.nextToken()); // 각 층의 방의 갯수
			N = Integer.parseInt(st.nextToken()); // N번째 손님

			int Y;
			int X;
			if(N % H == 0) {
				Y = H; // 층 수
				X = N / H; // 호 수
			} else {
				Y = N % H; // 층 수 
				X = N / H + 1; // 호 수
			}
						
			String YY = Integer.toString(Y);
			String XX = Integer.toString(X);
			
			if(XX.length() < 2) {
				System.out.println(YY + "0" + XX);
			} else {
				System.out.println(YY + XX);
			}
		}
	}
}
