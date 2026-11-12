package com.Strings;

import java.util.Scanner;

public class Palindrome2 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter a String for palindrome check ");
	    String s = sc.nextLine();
	    
	    int start = 0;
	    int end = s.length()-1;
	    
	    s = s.toLowerCase();
	    boolean isPalindrome = true;
	    
	    while(start < end) {
	    	if(s.charAt(start)!= s.charAt(end)) {
	    		isPalindrome = false;
	    		break;
	    	}
	    	start ++;
	    	end --;
	    }
	    System.out.println(isPalindrome ? "Palindrome" : "Not a palindrome");
    }
}
