package com.Strings;

import java.util.HashSet;
import java.util.Set;

public class Rough {
   public static void main(String[] args) {
	   String s = "Madam";
	   s = s.toLowerCase();
	   
	   int start = 0;
	   int end = s.length()-1;
	   
	   boolean palindrome = true;
	   
	   while(start<end) {
		   if(s.charAt(start)!=s.charAt(end)) {
			   palindrome = false;
			   break;
		   }
		   start++;
		   end--;
	   }
	   
	   if (palindrome) System.out.println("Palindrome");
	   else System.out.println("Not a Palindrome ");
   }
}
