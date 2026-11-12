package com.RoughPractice;

public class Test{
	
	String name ;
	int age;
	
	 public Test(String name,  int age) {
		this.name = name;
		this.age = age	;	
	}
	
	
	public static void main(String args[]) {
		Test t = new Test("Towseef",23);
		System.out.println(t);
	}
}