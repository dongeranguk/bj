package backjoon.solution;

public class SumOfContinuousNum {
	public static void main(String[] args) {
		int num = 3;
		int total = 12;
		
		int[] answer  = solution(num, total);
		
		System.out.print("[ ");
		for(int i : answer) {
			System.out.print(i + " ");
		}
		System.out.print("]");
	}
	
	public static int[] solution(int num, int total) {
		int[] answer = new int[num];
		
		int nSum = num * (1 + num) / 2;
		int start = (total - nSum) / num;
		
		for(int i=1; i<num+1; i++) {
			answer[i-1] = i + start; 
		}
		return answer;
	}
}
