package backjoon.solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class P17298 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		
		int cnt = Integer.parseInt(br.readLine());
		StringTokenizer st =  new StringTokenizer(br.readLine(), " ");
		
		int[] A = new int[cnt];
		int[] ans = new int[cnt];
		
		for(int i=0; i<cnt; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		
		Stack<Integer> stack = new Stack<>();
		stack.push(0);
		for(int i=1; i<cnt; i++) {
			while(!stack.isEmpty() && A[stack.peek()] < A[i]) {
				ans[stack.pop()] = A[i];
			}
			stack.push(i);
		}
		while(!stack.isEmpty()) {
			ans[stack.pop()] = -1;
		}
		
		for(int i=0; i<cnt; i++) {
			sb.append(ans[i] + " ");
		}
		System.out.println(sb);
	}
}
