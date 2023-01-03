package backjoon.solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P12891 {
	static int[] myArr;
	static int[] checkArr;
	static int checkSecret;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int S = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());
		
		String str = br.readLine();
		char[] A = str.toCharArray();

		myArr = new int[4];
		checkArr = new int[4];
		int Result = 0;
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<4; i++) {
			checkArr[i] = Integer.parseInt(st.nextToken());
			if(checkArr[i] == 0)
				checkSecret++;
		}

		for(int i=0; i<P; i++) {
			add(A[i]);
		}

		if(checkSecret == 4) 
			Result++;


		for(int i=P; i<S; i++) {
			int j = i - P;
			add(A[i]);
			remove(A[j]);
			if(checkSecret == 4) 
				Result++;
		}
		
		
		System.out.println(Result);
	}
	
	public static void add(char c) {
		switch(c) {
			case 'A' :
				myArr[0]++;
				if(myArr[0] == checkArr[0])
					checkSecret++;
				break;
			case 'C' :
				myArr[1]++;
				if(myArr[1] == checkArr[1])
					checkSecret++;
				break;
			case 'G' :
				myArr[2]++;
				if(myArr[2] == checkArr[2])
					checkSecret++;
				break;
			case 'T' :
				myArr[3]++;
				if(myArr[3] == checkArr[3])
					checkSecret++;
				break;
		}
	}
	
	public static void remove(char c) {
		switch(c) {
			case 'A' :
				if(myArr[0] == checkArr[0])
					checkSecret--;
				myArr[0]--;
				break;
			case 'C' :
				if(myArr[1] == checkArr[1])
					checkSecret--;
				myArr[1]--;
				break;
			case 'G' :
				if(myArr[2] == checkArr[2])
					checkSecret--;
				myArr[2]--;
				break;
			case 'T' :
				if(myArr[3] == checkArr[3])
					checkSecret--;
				myArr[3]--;
				break;
		}
	}
}
