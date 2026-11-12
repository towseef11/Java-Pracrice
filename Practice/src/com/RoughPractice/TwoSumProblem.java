package com.RoughPractice;

import java.util.HashMap;
import java.util.Map;

public class TwoSumProblem {
   public static void main(String[] args) {
	int arr[] = {1,2,3,4,5};
	int target = 5;
	//manual way
//	for(int i=0;i<arr.length;i++) {
//		for(int j=i+1;j<arr.length;j++) {
//			if(arr[j]+arr[i]==target) {
//				System.out.println(i+" "+j);
//			}
//		}
//	}
	Map<Integer , Integer> map = new HashMap<>();
	for(int i=0;i<arr.length;i++) {
		int needed = target - arr[i];
		if(map.containsKey(needed)) {
			System.out.println(map.get(needed)+" "+i);
			return;
		}		
		map.put(arr[i], i);
	}
	System.out.println("no pair found !!");
}
}
