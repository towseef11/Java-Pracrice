package com.LeetCode;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
//here ex : aaAbBc
//output : 2 (because  a and A-> count 1 b and B -> count = 2)
public class LoweCaseUpperCaseofCharacter {
	
	public static int solve(String s) {
		int count = 0;
		Set<Character> lower = new HashSet<>();
		Set<Character> upper = new HashSet<>();
		
		for(char c : s.toCharArray()) {
			if(Character.isLowerCase(c)) {
				lower.add(c);
			}
			else upper.add(c);
		}
		
		for(char c : lower) {
			if(upper.contains(Character.toUpperCase(c))) {
				count++;
			}
		}
		
		return count;
	}
	
    public static void main(String[] args) {
    	System.out.println();
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int count = solve(s);
		System.out.println(count);
	}
}
