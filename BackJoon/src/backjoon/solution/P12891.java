package backjoon.solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P12891 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int S = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());
		
		char[] A = new char[S];
		
		String str_A = br.readLine();
		
		A = str_A.toCharArray();
		
		char[] checkArr = new char[4];
		char[] myArr = new char[4];
		
		int Result = 0;
		int checkSecret = 0;
		
		for(int i=0; i<P; i++) {
			System.out.println((char)A[i] - 48);
			System.out.println(A[i] - 65);
			if((A[i] - 'A') == 'A') {
				myArr[0]++;
			} else if((A[i] - 'A') == 'C') {
				myArr[1]++;
			} else if((A[i] - 'A') == 'G') {
				myArr[2]++;
			} else if((A[i] - 'A') == 'T') {
				myArr[3]++;
			}
		}
		
	}
}
