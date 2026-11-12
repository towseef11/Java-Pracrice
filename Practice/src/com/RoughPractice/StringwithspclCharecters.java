package com.RoughPractice;

public class StringwithspclCharecters {
    public static void main(String[] args) {
		String s = "a$b#c";
		char arr[] = s.toCharArray();
		int start = 0;
		int end = arr.length-1;
		while(start<end) {
			if(!Character.isLetterOrDigit(arr[start])) {
				start++;
			}
			else if(!Character.isLetterOrDigit(arr[end])) {
				end--;
			}
			else {
				char temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
				start++;
				end--;
			}
			
		}
		
		System.out.println(new String(arr));
		
		
	}
}
