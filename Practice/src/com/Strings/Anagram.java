package com.Strings;

import java.util.Arrays;
//means if two strings contains same elements irrespective of positions they are said
//to be anagram
public class Anagram {
   public static void main(String[] args) {
	String s1 = "silent";
	String s2 = "listen";
	char[] a = s1.toCharArray();
	char[] b = s2.toCharArray();
    
	Arrays.sort(a);
	Arrays.sort(b);
	
	if(Arrays.equals(a,b)) System.out.println("Anagram");
	else System.out.println("Not an anagram");
    
}
}
