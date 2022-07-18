package backjoon.solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_2941 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String croa = br.readLine();
		int len = 0;

		for (int i = 0; i < croa.length(); i++) {
			if (croa.charAt(i) == 'c') {
				if (croa.charAt(i + 1) == '=') {
					len += 1;
					i++;
					continue;
				} else if (croa.charAt(i + 1) == '-') {
					len += 1;
					i++;
					continue;
				} else {
					len++;
				}
			} else if (croa.charAt(i) == 'd') {
				if (croa.charAt(i + 1) == 'z') {
					if (croa.charAt(i + 2) == '=') {
						len += 1;
						i += 2;
						continue;
					}
				} else if (croa.charAt(i + 1) == '-') {
					len += 1;
					i++;
					continue;
				} else {
					len++;
				}
			} else if (croa.charAt(i) == 'l') {
				if (croa.charAt(i + 1) == 'j') {
					len += 1;
					i++;
					continue;
				} else {
					len++;
				}
			} else if (croa.charAt(i) == 'n') {
				if (croa.charAt(i + 1) == 'j') {
					len += 1;
					i++;
					continue;
				} else {
					len++;
				}
			} else if (croa.charAt(i) == 's') {
				if (croa.charAt(i + 1) == '=') {
					len += 1;
					i++;
					continue;
				} else {
					len++;
				}
			} else if (croa.charAt(i) == 'z') {
				if (croa.charAt(i + 1) == '=') {
					len += 1;
					i++;
					continue;
				} else {
					len++;
				}
			} else {
				len += 1;
			}
		}
		System.out.println(len);
	}
}
