package backjoon.solution;

import java.io.IOException;
import java.util.Scanner;

public class Solution_1316_2 {
	
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		int N = in.nextInt();
		int cnt = 0;
		
		for(int i=0; i<N; i++) {
			if(check() == true) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
	
	public static boolean check() {
		boolean[] check = new boolean[26];
		int prev = 0;
		String str = in.next();
		
		for(int i=0; i<str.length(); i++) {
			int now = str.charAt(i);
			
			if(prev != now) {
				if(check[now - 'a'] == false) {
					check[now - 'a'] = true;
					prev = now;
				} else {
					return false;
				}
			} else {
				continue;
			}
		}
		return true;
	}
}
