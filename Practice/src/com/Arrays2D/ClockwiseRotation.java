package com.Arrays2D;

public class ClockwiseRotation {
	public static void main(String[] args) {
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        //transpose
        for(int i = 0; i<arr.length ; i++) {
        	for(int j = i ; j <arr.length ; j++) {
        		int temp = arr[i][j];
        		arr[i][j] = arr[j][i];
        		arr[j][i] = temp;
        	}
        }
        
        //reversing row
        for(int i = 0 ; i<arr.length ; i++) {
        	
        		int start = 0;
        		int end = arr.length-1;
        		while(start<end) {
        			int temp = arr[i][start];
        			arr[i][start] = arr[i][end];
        			arr[i][end] = temp;
        			start++;      
        			end--;
        		}
        	}
        
        
        //representation
        for(int i = 0 ; i < arr.length ; i++) {
        	for(int j = 0 ; j < arr[i].length ; j++) {
        		System.out.print(arr[i][j]+" ");
        	}
        	System.out.println();
        }
        
	}
}
