package com.Arrays2D;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println();
       int arr[][] = new int [3][3];
       
       for(int i=0 ; i<arr.length;i++) {
    	   for(int j=0; j<arr[i].length; j++) {
    		   arr[i][j] = sc.nextInt();
    	   }
       }
       
       int diagonalSum = 0;
       for(int i = 0; i<arr.length;i++) {
    	  
    	   for(int j=0;j<arr[i].length;j++) {
    		   if(i+j==3-1) {
    			   diagonalSum+=arr[i][j];
    		   }
    	   }
    	   
       }
       System.out.println(diagonalSum);
   
	}
}
