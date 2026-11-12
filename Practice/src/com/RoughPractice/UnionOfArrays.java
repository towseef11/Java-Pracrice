package com.RoughPractice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class UnionOfArrays {
   public static void main(String[] args) {
	int arr1[] = {1,2,3,4};
	int arr2[] = {4,5,6,7};
	Set<Integer> set = new HashSet<>();
    
	for(int i=0;i<arr1.length;i++) {
		set.add(arr1[i]);
	}
	for(int j=0;j<arr2.length;j++) {
		if(set.contains(arr2[j])) {
			System.out.print(arr2[j]+" ");
			set.remove(arr2[j]);
		}
	}
	
}
}
