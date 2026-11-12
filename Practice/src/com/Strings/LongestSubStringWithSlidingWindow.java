package com.Strings;

import java.util.HashSet;
import java.util.Set;

public class LongestSubStringWithSlidingWindow {
    public static void main(String[] args) {
		String s = "abcabab";
		Set<Character> set = new HashSet<>();
		int i = 0;
		int j = 0;
		int maxlength = 0;
		
		while(j<s.length()) {
			if(!set.contains(s.charAt(j))) {
				set.add(s.charAt(j));
				maxlength = Math.max(maxlength, j-i+1);
				j++;
			}
			else {
				set.remove(s.charAt(i));
				i++;
			}
		}
		System.out.println(maxlength);
		
	}
}
