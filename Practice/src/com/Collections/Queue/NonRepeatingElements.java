package com.Collections.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class NonRepeatingElements {
	
	public static void nonRepeatingElements(String s) {
		Queue<Character> q = new LinkedList<>();
		int[] f = new int[26];
		
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			q.offer(c);
			f[c - 'a']++;
			while(!q.isEmpty()&& f[q.peek()-'a']>1) {
				q.poll();
			}
			if(q.isEmpty()) {
				System.out.print(-1+" ");
			}
			else {
				System.out.print(q.peek()+" ");
			}
		}
		
	}
	
	public static void main(String[] args) {
		String s = "aabc";
		nonRepeatingElements(s);
	}
}
