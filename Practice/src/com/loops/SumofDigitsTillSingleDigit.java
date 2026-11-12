package com.loops;

import java.util.Scanner;

public class SumofDigitsTillSingleDigit {

	public static int getResult(int n) {

		int sum = 0;
		while (n > 0) {
			
			int rem = n % 10;
			sum = sum + rem;
			n = n / 10;
		}
		
		return sum;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt(); // 128 -> 11 -> 2

		int result= getResult(n);
		
		while(result > 9) {
			result = getResult(result);
		}
		
		System.out.println(result);
		

	}
}
