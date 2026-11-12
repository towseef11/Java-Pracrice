package com.Strings;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacter {
   public static void main(String[] args) {
	String s = "aabbccd";
	Map<Character,Integer> map = new HashMap<>();
	for(char c:s.toCharArray()) {
	      	map.put(c,map.getOrDefault(c, 0)+1);
	}
	
	for(int i=0;i<s.length();i++) {
          int count = map.get(s.charAt(i));
          if(count == 1) {
          System.out.println(i);
          return;
          }
          
	}
	System.out.println(-1);
}
}
