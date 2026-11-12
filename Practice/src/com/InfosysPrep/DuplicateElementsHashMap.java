package com.InfosysPrep;

import java.util.HashMap;
import java.util.Map;

public class DuplicateElementsHashMap {
	public static void main(String[] args) {
        int arr[] = {2,2,1,2,2,2,3,3};
        Map<Integer,Integer> map = new HashMap<>();
        int key = 0;
        for(int i=0;i<arr.length;i++) {
        	map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
        	if(entry.getValue()> 1) {
        		System.out.println(entry.getKey());
        	}
        }
        
	}
}
