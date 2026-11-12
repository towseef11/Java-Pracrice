package com.RoughPractice;

public class SecondHeightElementin {
    public static void main(String[] args) {
		int arr[] = {-10,-20,-30,-5};
		int max = Integer.MIN_VALUE;
		int secondmax = Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				secondmax = max;
				max = arr[i];
			}
			
			else if(arr[i]>secondmax && arr[i]<max) {
				secondmax = arr[i];
			}
			
		}
		if(secondmax==Integer.MIN_VALUE) {
			System.out.println("given array is single element array");
			return;
		}
		System.out.println(secondmax);
	}
}
