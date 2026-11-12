package com.Collections.Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeTest1 {
	
  public static String validOrNot(String s) {
	  Deque<Character> q = new ArrayDeque<>();

	  for(int i=0;i<s.length();i++) {
		  char c = s.charAt(i);
		  
		  // 1. Push opening brackets
		  if(c=='(' || c=='{' || c=='[') {
			  q.push(c);
		  }
		  // 2. Handle closing brackets
		  else if(c==')' || c=='}' || c==']') {
			  
			  // Prevent NullPointerException
			  if(q.isEmpty()) return "invalid";
			  
			  // If it's a perfect match, pop it
			  if( (c==')' && q.peek()=='(') ||
				  (c=='}' && q.peek()=='{') ||
				  (c==']' && q.peek()=='[') ) {
				  q.pop();
			  } 
			  // CRITICAL: If it's a closing bracket but NOT a match, fail immediately
			  else {
				  return "invalid";
			  }
		  }
	  }
	  
	  // 3. Check if any unmatched opening brackets are left over
	  if (q.isEmpty()) return "valid";
	  else return "invalid";		  
  }	
	
  public static void main(String[] args) {
	String s = "(]())"; 
	System.out.println(validOrNot(s)); // Now correctly prints "invalid"
  }
}