package backjoon.solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1253_3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		long[] A = new long[N];

		StringTokenizer st = new StringTokenizer(br.readLine());

		for(int i=0; i<N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		
		int result = 0;
		
		Arrays.sort(A);
		for(int k=0; k<N; k++) {
			long find = A[k];
			int i = 0, j = N-1;
			
			while(i < j) {
				if(A[i] + A[j] == find) {
					if(i != k && j != k) {
						result++;
						break;
					} else if(i == k) {
						i++;
					} else if(j == k){
						j--;
					}
				} else if(A[i] + A[j] < find) {
					i++;
				} else {
					j--;
				}
			}
		}
		System.out.println(result);
		
		
		
		
	}
}
