package com.InfosysPrep;

import java.util.LinkedHashMap;
import java.util.Map;

public class LongestSubStringWIthoutDuplicateCharecters2 {
  //using map
	public static void main(String[] args) {
		String s = "abbas";// 
		
		Map<Character,Integer> map = new LinkedHashMap<>();
		
		int maxlen = 0;
		int left = 0;
		int start = 0;
		
		for(int right=0 ; right <s.length(); right++) {
			char c = s.charAt(right);
			
			if(map.containsKey(c) && map.get(c)>=left) {
				left = map.get(c)+1;
			}
			
			map.put(c, right);
 
			if(right - left + 1>maxlen) {
				maxlen = right - left + 1;
				start = left;
			}
			
			
		}
		System.out.print(maxlen);
		System.out.println();
		for(int i=start ; i< start+maxlen;i++) {
			System.out.print(s.charAt(i));
		}
		
	}
}
