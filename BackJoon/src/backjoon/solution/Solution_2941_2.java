package backjoon.solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_2941_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String croa = br.readLine();
		int length = croa.length();
		int cnt = 0;

		for (int i = 0; i < length; i++) {
			if (croa.charAt(i) == 'c') {
				if (i < length - 1) {
					if (croa.charAt(i + 1) == '=') {
						cnt++;
						i++;
						continue;
					} else if (croa.charAt(i + 1) == '-') {
						cnt++;
						i++;
						continue;
					}
				}
			}

			if (croa.charAt(i) == 'd') {
				if (i < length - 1) {
					if (croa.charAt(i + 1) == 'z') {
						if (i < length - 2) {
							if (croa.charAt(i + 2) == '=') {
								cnt++;
								i += 2;
								continue;
							}
						}
					} else if (croa.charAt(i + 1) == '-') {
						cnt++;
						i++;
						continue;
					}
				}
			}

			if (croa.charAt(i) == 'l') {
				if (i < length - 1) {
					if (croa.charAt(i + 1) == 'j') {
						cnt++;
						i++;
						continue;
					}
				}
			}

			if (croa.charAt(i) == 'n') {
				if (i < length - 1) {
					if (croa.charAt(i + 1) == 'j') {
						cnt++;
						i++;
						continue;
					}
				}
			}

			if (croa.charAt(i) == 's') {
				if (i < length - 1) {
					if (croa.charAt(i + 1) == '=') {
						cnt++;
						i++;
						continue;
					}
				}
			}

			if (croa.charAt(i) == 'z') {
				if (i < length - 1) {
					if (croa.charAt(i + 1) == '=') {
						cnt++;
						i++;
						continue;
					}
				}
			}
			cnt++;
		}

		System.out.println(cnt);
	}
}
