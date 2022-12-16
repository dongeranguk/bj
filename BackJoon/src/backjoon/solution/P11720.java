package backjoon.solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P11720 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String str = br.readLine();
		
		char[] c_arr = str.toCharArray();
		
		int sum = 0;
		for(int i=0; i<N; i++) {
			sum += c_arr[i] - '0';
		}
		System.out.println(sum);
	}
}
