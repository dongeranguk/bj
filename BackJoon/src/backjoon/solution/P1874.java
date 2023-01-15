package backjoon.solution;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class P1874 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		
		int N = Integer.parseInt(br.readLine());
		int A[] = new int[N];
		Stack<Integer> stack = new Stack<>();
		
		int num = 1;
		boolean result = true;
		for(int i=0; i<N; i++) {
			A[i] = Integer.parseInt(br.readLine());
		}
		
		for(int i=0; i<A.length; i++) {
			int su = A[i];

			if(su >= num) {
				while(su >= num) {
					stack.push(num++);
					sb.append("+\n");
				}
				stack.pop();
				sb.append("-\n");
				
			} else {
				int n = stack.pop();
				
				if(n > su) {
					System.out.println("NO");
					result = false;
					break;
				} else {
					sb.append("-\n");
				}
			}
		}
		
		if(result) System.out.println(sb.toString());
	}
}
