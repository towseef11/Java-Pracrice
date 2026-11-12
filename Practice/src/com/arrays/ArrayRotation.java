package com.arrays;

import java.util.Scanner;

public class ArrayRotation {
	public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6};
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the key for rotation : ");
        int k = sc.nextInt();//2
        int index = 0;
        int temp[] = new int[a.length];
        int tindex =0 ;
        
        
        for(int i=0;i<k;i++) {
           temp[tindex] = a[i];//1 2
           tindex++;
        }
        
        for(int i=k;i<a.length;i++) {//    3 4 5 6 | 5 6     	
        	a[index]=a[i];
        	index++;
        }
        tindex = 0 ;
        for(int i=index;i<a.length;i++) {
        	
        	a[i]= temp[tindex];
        	tindex++;
        }
        
        for(int a1:a) {
        	System.out.print(a1+ " ");
        }
        
	}
}
