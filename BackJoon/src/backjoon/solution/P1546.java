package backjoon.solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1546 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int[] score = new int[N];
		
		int sum = 0;
		int max = 0;
		
		for(int i=0; i<N; i++) {
			score[i] = Integer.parseInt(st.nextToken());

			if(max < score[i]) max = score[i];
			
			sum += score[i];
		}
		
		System.out.println(sum * 100.0 / max / N);
	}
}
