package com.arrays;

public class LeftRotate { 
	
  public static void rev(int arr[],int start, int end) {
	  while(start<end) {
		  int temp = arr[start];
		  arr[start] = arr[end];
		  arr[end] = temp;
		  start++;
		  end--;
				  
	  }
  }	
	
  public static void main(String[] args) {
	int arr[] = {1,2,3,4,5};
	int k = 2;
	int size = arr.length;
	rev(arr,0,size-1);
	rev(arr,0,size-k-1);
	rev(arr,size-k,size-1);
	for(int a:arr) {
		System.out.print(a+" ");
	}
}
}
