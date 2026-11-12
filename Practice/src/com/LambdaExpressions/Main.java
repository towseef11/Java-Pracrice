package com.LambdaExpressions;



public class Main{
	public static void main(String[] args) {
		Test t = () -> {
			System.out.println("Hello");
		};
		
		t.display();
	}
}
