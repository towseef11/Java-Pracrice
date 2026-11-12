package com.Sorting;

public class InsertionSort {
    public static void main(String[] args) {
		int a[] = {5,4,3,2,1};
		for(int i=1;i<a.length;i++) {
			int current = a[i];
			int j = i-1;
			
			while(j>=0 && a[j]>current) {
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = current;
		}
		for(int a1:a) {
			System.out.print(a1+" ");
		}
	}
}
