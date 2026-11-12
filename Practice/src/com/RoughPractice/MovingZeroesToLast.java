package com.RoughPractice;

public class MovingZeroesToLast {
	public static void main(String[] args) {
       int a[] = {0,2,0,0};
       int position =0;
       for(int i=0;i<a.length;i++) {
    	   if(a[i]!=0) {
    		   a[position] = a[i];
    		   position++;
    	   }
    	   
       }
       while(position<a.length) {
    	   a[position]=0;
    	   position++;
       }
       
       for(int a2:a) {
    	   System.out.print(a2+" ");
       }
	}
}
