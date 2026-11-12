package com.RoughPractice;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstRepeatingElement {
    public static void main(String[] args) {
		int arr[] = {1,2,3,3,4};
		Map<Integer,Integer> map = new LinkedHashMap<>();
		for(int i=0;i<arr.length;i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		}
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey());
				return;
			}
		}
	}
}
