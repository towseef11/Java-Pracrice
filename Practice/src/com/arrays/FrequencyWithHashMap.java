package com.arrays;

import java.util.HashMap;
import java.util.Map;

public class FrequencyWithHashMap {
	public static void main(String[] args) {
          int a[] = {1,2,3,4,5,5,6};
          
          HashMap<Integer,Integer> frequency = new HashMap<>();
          
          for(int i=0;i<a.length;i++) {
        	  frequency.put(a[i], frequency.getOrDefault(a[i], 0)+1);
          }
          
          for(Map.Entry<Integer, Integer> entry : frequency.entrySet()){
        	  if(entry.getValue()>1) {
        		  
        		  System.out.print(entry.getKey()+" -> ");
        		  System.out.print(entry.getValue()+" ");
        	  }
          }
	}
}
