package backjoon.solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1940_2 {
	public static void main(String[] arg) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		
		int[] A = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for(int i=0; i<N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(A);
		
		int cnt = 0, i = 0, j = N - 1;
		
		while(i < j) {
			if(A[i] + A[j] > M) {
				j--;
			} else if(A[i] + A[j] < M) {
				i++;
			} else {
				cnt++;
				i++; j--;
			}
		}
		
		System.out.println(cnt);
		
	}
}
