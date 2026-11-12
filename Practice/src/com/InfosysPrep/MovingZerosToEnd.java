package com.InfosysPrep;

public class MovingZerosToEnd {
	public static void main(String[] args) {
        int arr[] = {1,2,0,0,3,4};
        int pos = 0 ;
        for(int i=0;i<arr.length;i++) {
        	
        	if(arr[i]!=0) {
        		arr[pos] = arr[i];//1, 2, 3, 4
        		pos++;//1 , 2, 3, 4
        	}
        }
        	while(pos<arr.length) {
        		arr[pos] = 0;
        		pos++;
        	}
        
        for(int a:arr) {
        	System.out.print(a+" ");
        }
	}
}
