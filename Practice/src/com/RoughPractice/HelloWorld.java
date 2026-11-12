package com.RoughPractice;


public class HelloWorld {
	
	String name;
	int age;
	
	public HelloWorld(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "User [name :"+name+" age : "+age +"]";
	}
	
	public static void main(String[] args) {
		HelloWorld h = new HelloWorld("Towseef",23);
		System.out.println(h);
	}
}
