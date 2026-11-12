package com.arrays;

public class SortedorNot {
	public static void main(String[] args) {
       int arr[] = {1,2,4,5,1};
       boolean sorted = true;
       for(int i=0;i<arr.length-1;i++) {
    	   
    	   if(arr[i]>arr[i+1]) {
    		   sorted = false;
    		   break;
    	   }    	          	   
       }
       if(sorted) System.out.println("Sorted");
       else System.out.println("not sorted");
	}
}
