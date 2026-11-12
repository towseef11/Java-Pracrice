package com.RoughPractice;

public class Stringgggg {
   public static void main(String[] args) {
	   String s = "Madam";
	   StringBuilder sb = new StringBuilder();
	   
	   for(int i=s.length()-1;i>=0;i--) {
		   char c = s.charAt(i);
		   sb.append(c);
	   }
	   if(s.equalsIgnoreCase(sb.toString())) System.out.println("Palindrome");
	   else System.out.println("Not palindrome");
   }
}
