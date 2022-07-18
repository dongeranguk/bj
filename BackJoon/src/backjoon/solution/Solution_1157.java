package backjoon.solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_1157 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		int[] alpha = new int[26];
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) >= 'a') {
				alpha[str.charAt(i) - 97]++;
			} else {
				alpha[str.charAt(i) - 65]++;
			}
		}
		
		int max = -1;
		char ch = '?';
		
		for(int j=0; j < alpha.length; j++) {
			if(alpha[j] > max) {
				max = alpha[j];
				ch = (char)(j + 65);
			} else if(alpha[j] == max) {
				ch = '?';
			}
		}
		System.out.println(ch);
	}
}
