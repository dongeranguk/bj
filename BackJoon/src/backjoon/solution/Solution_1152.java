package backjoon.solution;

import java.io.IOException;

public class Solution_1152 {
	public static void main(String[] args) throws IOException {
		
		int str;
		int pre_str = 32;
		int cnt = 0;
		
		while(true) {
			str = System.in.read();
			
			if(str == 32) { 
				if(pre_str != 32) cnt++;
			}
			else if(str == 10) {
				if(pre_str != 32) cnt++;
				break;
			}
			
			pre_str = str;
		}
		
		System.out.println(cnt);
	}
}