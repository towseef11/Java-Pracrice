package com.Sorting;

public class SelectionSorting {
   public static void main(String[] args) {
	int arr[] = {7,3,2,9,4,5};

	for(int i=0;i<arr.length-1;i++) {
		   int minindex = i;
		for(int j=i+1;j<arr.length;j++) {
			if(arr[j]<arr[minindex]) {
				minindex = j;
			}
		}
		int temp = 0;
		temp = arr[i];
		arr[i] = arr[minindex];
		arr[minindex]=temp;
	}
	
	for(int a:arr) {
		System.out.print(a+" ");
	}
}
}
