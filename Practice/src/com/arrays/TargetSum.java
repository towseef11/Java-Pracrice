package com.arrays;

import java.util.Scanner;

public class TargetSum {
   public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of array ");
	
	int size = sc.nextInt();
	
	int arr[]= new int[size];
	
	System.out.println("Enter the elements into the array : ");
	
	for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
	}
	
	System.out.println("enter the target element :");
	
	int target = sc.nextInt();
	
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]+arr[j]==target) {
				System.out.println("["+i+","+j+"]");
			}
		}
	}
}
}
