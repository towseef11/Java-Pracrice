package com.RoughPractice;

//kadane's algorithm
public class LargestSumofSubArray {
    public static void main(String[] args) {
		int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
		int max = arr[0];
		int curmax = arr[0];
		
		int start = 0;
		int end = 0;
		int tempstart = 0;
		
		for(int i=0 ; i<arr.length ; i++) {
			if(arr[i]>curmax+arr[i]) {
				curmax = arr[i];
				tempstart= i;
			}
			else {
				curmax += arr[i];
			}
			if(curmax>max) {
				max = curmax;
				start = tempstart;
				end = i;
			}
		}
		System.out.println(max);
		System.out.println("start : "+start);
		System.out.println("End : "+end);
		for(int i=start;i<=end;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
}
