package com.arrays;

public class ShiftingZeroestoEnd {
	public static void main(String[] args) {
		int a[] = {1,0,6,0,5,0,0,2};
		int index = 0 ;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]!=0) {
				a[index]=a[i];
				index++;
			}
		}
		while(index<a.length) {
			a[index]=0;
			index++;
		}
		for(int a1:a) {
			System.out.print(a1+" ");
		}
		
	}
}
