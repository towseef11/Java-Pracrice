package com.OptiPractice;

public class MaxSumSubArray {
	
	public static int getMaxSuminSubArray(int[] arr,int k) {
		int sum = 0;
		int windowsum = 0;
		int windowstart = 0;
		
		for(int i=0;i<arr.length;i++) {
			windowsum+=arr[i];
			if(i>=k-1) {
				sum = Math.max(windowsum,sum);
				windowsum-=arr[windowstart];
				windowstart++;
			}
		}
		return sum;
		
	}
	
	public static void main(String[] args) {
    int[] arr = {1,45,4,5,6,7};
    int k = 3;
    System.out.println("Maximum sum of sub array of size k is : "+getMaxSuminSubArray(arr,k));
	}
}
