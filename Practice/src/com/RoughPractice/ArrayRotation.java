package com.RoughPractice;

public class ArrayRotation {
	
	public static void rev(int arr[],int left,int right) {
		while(left<right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] =  temp;
			left++;
			right--;
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6};
		int k = 3;
		rev(arr,0,arr.length-1);// 6 5 4 3 2 1
		rev(arr,0,k-1);
		rev(arr,k,arr.length-1);
		for(int a:arr) {
			System.out.print(a+" ");
		}
	}
}
