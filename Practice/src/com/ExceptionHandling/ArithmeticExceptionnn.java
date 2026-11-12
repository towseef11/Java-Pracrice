package com.ExceptionHandling;

import java.util.Scanner;

public class ArithmeticExceptionnn {
	
	public static int method(int a, int b) {
		try {
			int c=a/b;
			return c;
		}catch(Exception e) {
            System.out.println("b value cannot be 0");
			return 0;
		}
		finally {
			System.out.println("Cleanup done");
			
		}
		
	}
	
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("enter number a");
    	int a = sc.nextInt();
    	System.out.println("enter number b");
    	int b = sc.nextInt();
    	int r = method(a,b);
    	System.out.println(r);
    }
}
