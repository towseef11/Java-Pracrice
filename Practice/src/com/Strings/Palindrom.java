package com.Strings;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String to check for plaindrom");
		String s = sc.nextLine();
	     
        String s2 = "";
        
        for(int i=s.length()-1;i>=0;i--) {
        	s2 = s2 + s.charAt(i);
        }
	
        if(s.equalsIgnoreCase(s2)) System.out.println("palindrome");
        else System.out.println("not a palindrome");
        
	}
}
