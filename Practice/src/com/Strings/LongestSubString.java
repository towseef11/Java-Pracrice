package com.Strings;

import java.util.HashSet;
import java.util.Set;

public class LongestSubString {
	public static void main(String[] args) {
        String s = "abcbbaa";
        int maxlength = 0;
        Set<Character> set = new HashSet<>();
        for(int i=0;i<s.length();i++) {
        	
        	for(int j=i;j<s.length();j++) {
        		if(set.contains(s.charAt(j))) {
        			break;
        		}
        		set.add(s.charAt(j));
        		maxlength = Math.max(maxlength, j-i+1);
        		
        	}
        	
        }
        System.out.println(maxlength);
	}
}
