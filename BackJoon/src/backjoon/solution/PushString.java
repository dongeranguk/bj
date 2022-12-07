package backjoon.solution;

public class PushString {
	public static void main(String[] args) {
	
	}
	
	public static int solution(String A, String B) {
		int answer = 0;
		int count = 0;
		
		char[] c_arr = A.toCharArray();

		if(B.equals(A)) {
			answer = count;
		} else {
			for(int i=0; i<A.length(); i++) {
				c_arr[i] = c_arr[i+1];
				
				if(i)
			}
		}
		
		return answer;
	}
}
