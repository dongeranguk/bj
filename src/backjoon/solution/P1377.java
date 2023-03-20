package backjoon.solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P1377 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		mData[] a = new mData[N];
		
		for(int i=0; i<N; i++) {
			a[i] = new mData(Integer.parseInt(br.readLine()), i);
		}
		
		Arrays.sort(a);
		int max = 0;
		
		for(int i=0; i<N; i++) {
			if(max < a[i].index - i)
				max = a[i].index - i;
		}
		
		System.out.println(max + 1);
	}
}

class mData implements Comparable<mData> {
	int value;
	int index;
	
	public mData(int value, int index) {
		this.value = value;
		this.index = index;
	}
	
	@Override
	public int compareTo(mData o) {
		return this.value - o.value;
	}
}
