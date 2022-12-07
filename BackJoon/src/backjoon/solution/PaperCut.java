package backjoon.solution;

public class PaperCut {
	public static void main(String[] args) {
		int M = 2;
		int N = 2;
		
		int result = solution(M, N);
		System.out.println(result);
		
	}
	
	public static int solution(int M, int N) {
		int answer;
		
		answer = M * N - 1;
		
		return answer;
	}
}
