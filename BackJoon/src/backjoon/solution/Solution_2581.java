package backjoon.solution;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution_2581 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		
		int sum = make_Prime(M, N);
			
		System.out.println(sum);
		
	}
	
	public static int make_Prime(int M, int N) {
		boolean[] Prime = new boolean[N + 1];
		int sum = 0;
		int min = 0;
		
		for(int i=M; i<N; i++) {
			for(int j=2; j<=Math.sqrt(i); j++) {
				if(i % j == 0) {
					Prime[i] = false;
					break;
				} else {
					Prime[i] = true;
				}
			}
		}
		
		for(int i=0; i<Prime.length; i++) {
			if(Prime[i] == true) {
				sum += i;
			}
			
		}
		
		return sum;
	}
}
