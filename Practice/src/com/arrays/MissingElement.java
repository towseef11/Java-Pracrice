package com.arrays;

public class MissingElement {
	public static void main(String[] args) {
        int arr[] = {1,2,4,5};
        int n = arr[0];
        int sum = 0;
        for(int i=0;i<arr.length;i++) {
        	if (arr[i]>n) n = arr[i];
           sum+=arr[i];
        }
        System.out.println("Missing element is : "+(n*(n+1)/2-sum));
	}
}
