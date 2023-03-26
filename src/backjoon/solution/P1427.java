package backjoon.solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1427 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int[] A = new int[str.length()];
		
		for(int i=0; i<str.length(); i++) {
			A[i] = Integer.parseInt(str.substring(i, i+1));
		}
		
		for(int i=0; i<A.length; i++) {
			// 남은 정렬 부분이 없을 때까지 반복한다.
			int max = i;
			
			for(int j=i+1; j<A.length; j++) {
				// 남은 정렬 부분에서 최대값(max)을 찾는다.
				if(A[j] > A[max]) {
					max = j;
				}
			}
			
			if(A[i] < A[max]) {
				// 최대값(max)를 남은 정렬 부분의 가장 앞에 있는 데이터와 swap 한다.
				int temp = A[i];
				A[i] = A[max];
				A[max] = temp;
			}
		}
		
		for(int i=0; i<A.length; i++) {
			System.out.print(A[i]);
		}
	
	}

}
