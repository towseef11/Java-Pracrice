package com.Sorting;

public class BubbleSorting {
	
	//in bubble sort we will be having n-1 passes to get a sorted array
	// here each element is compared with it's corresponding element if a[j]+1 > a[j] swap <->
	public static void main(String[] args) {
        int arr[] = {5,2,4,1,7};
        
        for(int i=0;i<arr.length;i++) {
        	for(int j=0;j<arr.length-1;j++) {
        		if(arr[j]>arr[j+1]) {
        			int temp = 0;
        			temp = arr[j];
        			arr[j] = arr[j+1];
        			arr[j+1] = temp;
        		}
        	}
        }
        
        for(int a:arr) {
        	System.out.print(a+" ");
        }
	}
}
