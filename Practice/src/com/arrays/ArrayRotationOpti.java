package com.arrays;

import java.util.Scanner;

public class ArrayRotationOpti {
	
	public static void rev(int num[],int start, int end) {
		while(start<end) {
			int temp = num[start];
			num[start]=num[end];
			num[end]=temp;
			start++;
			end--;
		}
	}
	
    public static void main(String[] args) {
		
    	int arr[] = {1,2,3,4,5,6};
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the key for rotating : ");
	    int k =sc.nextInt();
	    
	    rev(arr,0,arr.length-1); //6 5 4 3 2 1
	    
	    rev(arr,0,k-1);  // 4 5 6 3 2 1
	    
	    rev(arr,k,arr.length-1); //4 5 6 1 2 3
	    
	    for(int a:arr) {
	    	System.out.print(a+" ");
	    }
	    
	}
}
