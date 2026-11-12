package com.arrays;

public class SecondLargerstElement {
    public static void main(String args[]) {
    	int arr[] = {2,5,5};
    	int max=Integer.MIN_VALUE;
    	int second=Integer.MIN_VALUE;
    	for(int i=0;i<arr.length;i++) {
          if(arr[i]> max) {
        	  second=max;
        	  max=arr[i];
          }
          else if(arr[i]<max && arr[i]>second) {
        	  second = arr[i];
          }
    	}
    	
    	if(second==Integer.MIN_VALUE) System.out.println("No second Largest Element ");
    	else System.out.println("Second max Element is : "+second );
    }
}
