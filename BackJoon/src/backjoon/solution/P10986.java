package backjoon.solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P10986 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		

		long[] A = new long[N];
		long[] S = new long[M];
		long answer = 0;
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=1; i<N; i++) {
			A[i] = A[i-1] + Integer.parseInt(st.nextToken());
		}
		
		for(int i=0; i<N; i++) {
			int remainder = (int) (S[i] % M);
			
			if(remainder == 0) answer++;
				
			S[remainder]++;
		}
		
		for(int i=0; i<M; i++) {
			if(S[i] > 1) {
				answer = answer + (S[i] * (S[i] - 1) / 2);
			}
		}
		
		System.out.println(answer);
	}
}
