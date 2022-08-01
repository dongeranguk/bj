package backjoon.solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_2869_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int up = Integer.parseInt(st.nextToken());
		int down = Integer.parseInt(st.nextToken());
		int height = Integer.parseInt(st.nextToken());
		
		int day = (height - down) / (up - down);
		System.out.println(day);
		if((height - down) % (up - down) != 0) {
			day++;
		}
		System.out.println(day);
	}
}
