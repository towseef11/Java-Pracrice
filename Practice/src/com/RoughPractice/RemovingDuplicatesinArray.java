package com.RoughPractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemovingDuplicatesinArray {
	public static void main(String[] args) {
		int arr[] = { 5, 4, 7, 2, 1, 8, 9, 2 };
		System.out.println("-- Using HashSet --");
		Set<Integer> set = new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			set.add(arr[i]);
		}
		System.out.println(set);
		
		System.out.println("-- Using Stream --");
		Arrays.stream(arr)
		      .distinct()
		      .boxed()
		      .sorted()
		      .forEach(System.out::println);
		
		System.out.println("-- using new Array --");
		
		int a[] = new int[arr.length];
		int index = 0;
		for(int i=0;i<arr.length;i++) {
		   boolean isDuplicate = false;
		   for(int j=0;j<index;j++) {
			   if(arr[i]==arr[j]) {
				   isDuplicate = true;
				   break;
			   }
		   	   
		   }
		   if(!isDuplicate) {
			   a[index] = arr[i];
			   index++;
		   }
		   
		}
		
		for(int i=0;i<index;i++) {
			System.out.print(a[i]+" ");
		}
		
		System.out.println();
		System.out.println("-- Using same Array --");
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			if(i==0||arr[i]!=arr[i-1]) {
				System.out.print(arr[i]+" ");
			}
		}
	}
}
