package com.Collections.Map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeatingElementIndex {
	public static void main(String[] args) {
		System.out.println();
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		Map<Character, Integer> map = new LinkedHashMap<>();
		for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c,0)+1);
		}
		for(Map.Entry<Character, Integer> entry  : map.entrySet()) {
			if(entry.getValue()<2) {
				System.out.println("First non-repeating element : "+entry.getKey());
				break;
			}
		}
	}
}

//   Leetcode
//   
//
//
//