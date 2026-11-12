package com.InfosysPrep;

public class MaximumSubArray {
	public static void main(String[] args) {
	   int arr[] = {1,2,3,2,1};
	   int k=3;
	   int windowsum = 0;
	   for(int i=0;i<k;i++) {
		   windowsum+=arr[i];
	   }
	   int maxSum = windowsum;
	   for(int i = k;i<arr.length;i++) {
		   windowsum+=arr[i]-arr[i-k];
		   maxSum = Math.max(maxSum, windowsum);
	   }
	   System.out.println(maxSum);
	}
}
