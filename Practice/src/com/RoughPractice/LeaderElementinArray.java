package com.RoughPractice;

public class LeaderElementinArray {
    public static void main(String[] args) {
		int arr[] = {10,6,2,9,2,1,4,3,7};
		int max = arr[arr.length-1];
		for(int i= arr.length-2; i>=0 ;i--) {
			if(arr[i]>max) {
				max = arr[i];
				System.out.println(max);
			}
		}
		
	}
}
