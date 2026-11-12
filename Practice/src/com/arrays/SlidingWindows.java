package com.arrays;

public class SlidingWindows {
	
	public static int getMaximumSum(int[] arr,int k) {
		int windowsum = 0;
		if(arr.length<k) {
			System.out.println("Array size should be grater than input size");
			System.exit(0);
		}
		for(int i=0;i<k;i++) {
			windowsum+=arr[i];
		}
		int maxsum = windowsum;
		for(int i=k;i<arr.length;i++) {
			windowsum+=arr[i]-arr[i-k];
			maxsum = Math.max(maxsum, windowsum);
		}
		
		return maxsum;
	}
	
    public static void main(String[] args) {
		int arr[] = {1,2};
		int k = 3;
		System.out.println("maximum sub array of size k : "+getMaximumSum(arr, k));
	}
} 
