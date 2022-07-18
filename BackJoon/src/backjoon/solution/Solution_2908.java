package backjoon.solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_2908 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		String s1 = st.nextToken();	
		String s2 = st.nextToken();
		
		String r1 = "";
		String r2 = "";
		
		for(int i=2; i>-1; i--) {
			r1 += s1.charAt(i) + "";
			r2 += s2.charAt(i) + "";
		}
		int t1 = Integer.parseInt(r1);
		int t2 = Integer.parseInt(r2);
		
		System.out.println((t1 > t2) ? t1 : t2);
	}
}
