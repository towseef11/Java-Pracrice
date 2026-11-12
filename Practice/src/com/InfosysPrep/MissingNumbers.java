package com.InfosysPrep;

public class MissingNumbers {
    public static void main(String[] args) {
		int arr[] = {1,3,4,5};
		int n = 5;
		int arrsum = 0;
		for(int i=0;i<arr.length;i++) {
			arrsum+=arr[i];
		}
		
		int missing = (n*(n+1))/2-arrsum;
		System.out.println(missing);
	}
}
