package com.RoughPractice;

public class ProductExceptItself {
	public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int result[] = new int[arr.length];
        
        int track = 0;
        
        
        for(int i = 0 ; i < arr.length ; i++) {//i=0
        	int product = 1;
        	for(int j = 0 ;j<arr.length;j++) {
        		if(i != j) {
        			product*=arr[j];
        		}
        	}
        	result[i] = product;
        	
        	
        }
        for(int r : result) {
        	System.out.print(r+" ");
        }
	}
}
