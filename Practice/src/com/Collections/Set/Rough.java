package com.Collections.Set;

import java.util.Set;
import java.util.TreeSet;

public class Rough {
   public static void main(String[] args) {
	   int arr[] = {23,45,12,87,90};
	   int max = 0;
	   int secmax = 0;
	   for(int i=0;i<arr.length;i++) {
		   for(int j=i+1;j<arr.length;j++) {
			   if(arr[j]>max) {
				   secmax = max;
				   max = arr[j];
				   
			   }
			   else if(arr[i]>secmax && arr[i]<max) secmax=arr[i];
		   }
		   
	   }
	   System.out.println(secmax);
   }
}
