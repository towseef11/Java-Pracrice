package com.Strings;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.xml.stream.events.Characters;

public class FirstNonRepeatingCharacter {
	public static void main(String[] args) {
		String s ="aabbcdd";
		
		Map<Character,Integer> map = new LinkedHashMap<>();
		
		for(char c : s.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			if(entry.getValue()==1) {
				System.out.println(entry.getKey());
				return;
			}
			
		}
	}
}
