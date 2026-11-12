package com.InfosysPrep;

import java.util.HashSet;
import java.util.Set;

public class MaxSumofSubArrayWithDisctinctElements {
	
	public static boolean isDuplicate(int arr[],int start,int end) {
		Set<Integer> set = new HashSet<>();
		boolean result = false;
		for(int i=start;i<=end;i++) {
			if(!set.add(arr[i])) {
				result = true;
			}
			else result = false;
		}
		return result;
	}
	
    public static void main(String[] args) {
		int arr[] = {1,2,3,2,1,5,6,7,5};
		int k = 3;
		int maxsum = 0;
		int start = 0;
		for(int i=0;i<=arr.length-k;i++) {
			if(!isDuplicate(arr,i,i+k-1)) {
				int sum = 0;
				int j;
				for(j=i;j<i+k;j++) {
					sum+=arr[j];
				    
				}
			    start = j;
				maxsum = Math.max(maxsum, sum);
				
			}
			
		}
//		for(int i=start;i<start+k;i++) {
//			System.out.print(arr[i]);
//		}
		System.out.println(maxsum);
		
	}
}
