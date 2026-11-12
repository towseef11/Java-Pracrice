package com.arrays;

import java.util.Arrays;

public class RemovingDDuplicates {
	public static void main(String[] args) {
      int arr[] = {3,2,1,6,7,1};
 
      Arrays.sort(arr);
      for(int i=0;i<arr.length;i++) {
    	  if(i==0||arr[i]!=arr[i-1]) {
    		  System.out.print(arr[i]+" ");
    	  }
      }
      
      
	}
}
