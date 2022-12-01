package backjoon.solution;

public class SumOfContinuousNum {
	public static void main(String[] args) {
		int num = 3;
		int total = 12;
		
		int[] answer  = solution(num, total);
		
		System.out.print("[ ");
		for(int i : answer) {
			System.out.print(i);
		}
		System.out.print(" ]");
	}
	
	public static int[] solution(int num, int total) {
		int[] answer = new int[num];
		
		int sum = 0;
		
		while(true) {
			int sign = 0;
			int val = num;
			
			if(sum == 0 || total > sum) {
				for(int i=0; i<num; i++) {
					sum += val;
					val++;
				}
				sign = 0;
			}
			
			if(total < sum) {
				for(int i=0; i<num; i++) {
					sum += val;
					val--;
				}
			}
			
			if(total == sum) {
				break;
			} else {
				if(sign == 0) {
					num--;
				} else {
					num++;
				}
			}
		}
		
		for(int i=0; i< num; i++) {
			answer[i] = num;
			num++;
		}
		
		return answer;
	}
}
