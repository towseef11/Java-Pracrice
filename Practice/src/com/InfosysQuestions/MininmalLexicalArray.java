package com.InfosysQuestions;
import java.util.Arrays;
import java.util.Scanner;

public class MininmalLexicalArray {
	
	public static int solve(int n,int x,int arr[]) {
		Arrays.fill(arr,x);
		int xor = 0;
		for(int a:arr) {
			xor^=a;
		}
		return xor;
	}
	
	public static void main(String[] args) {
		
       Scanner sc = new Scanner(System.in);
       System.out.println("Hello");
       int n = sc.nextInt();
       int x = sc.nextInt();
       
       int arr[] = new int[n];
       int result = solve(n,x,arr);
       System.out.println(result);
       sc.close();
	}
}
