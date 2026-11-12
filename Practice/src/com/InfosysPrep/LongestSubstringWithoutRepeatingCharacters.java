package com.InfosysPrep;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
	
	
	//with the help of set
    public static void main(String[] args) {
		String s = "pwwekk";
		
		Set<Character> set = new HashSet<>();
	    
		int left = 0;
		int maxlen = 0;
		int start = 0;
		
		for(int right=0 ; right<s.length() ; right++) {
			char c = s.charAt(right);
			
			while(set.contains(c)) {
				set.remove(s.charAt(left));
				left++;
			}
			set.add(c);
			if(right-left+1>maxlen) {
				maxlen =right-left+1;
				start = left;
			}
		}
		for(int i=start;i<start+maxlen;i++) {

			System.out.print(s.charAt(i));
		}
    }
}
