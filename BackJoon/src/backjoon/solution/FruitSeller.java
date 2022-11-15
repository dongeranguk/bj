package backjoon.solution;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FruitSeller {
	
	
	public int solution(int k, int m, int[] score) { 
		int answer = 0;
		
		Arrays.sort(score);
		
		int[] dScore = new int[score.length];
		
		int min = m;
		
		for(int i=0; i<score.length; i++) {
			dScore[i] = score[score.length - 1 - i];
		}
		
		int index = 0;
		while(true) {
			if(index >= dScore.length || index + m > dScore.length) {
				break;
			}
			
			answer = dScore[index + m - 1] * m;
			
			index += m;
			
		}
		
		return answer;
	}
}
