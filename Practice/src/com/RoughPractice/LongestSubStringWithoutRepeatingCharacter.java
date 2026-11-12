package com.RoughPractice;

import java.util.LinkedHashSet;
import java.util.Set;

public class LongestSubStringWithoutRepeatingCharacter {
	public static void main(String[] args) {
		String s = "Towseef";
		
		Set<Character> set = new LinkedHashSet<>();
		
		int maxlength = 0;
		int start = 0;
		int a = 0;
		int end = 0;
		while(end<s.length()) {
			if(!set.contains(s.charAt(end))) {
				set.add(s.charAt(end));
				if(end-start+1>maxlength) {
					maxlength = end-start+1;
					a = start;
				}
				end++;
			}
			else {
				set.remove(s.charAt(start));
			    start++;	
			}
		}
		System.out.println(maxlength);
		for(int i = a ; i< a+maxlength ; i++) {
			System.out.print(s.charAt(i));
		}
	}
}
