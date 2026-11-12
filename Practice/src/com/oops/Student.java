package com.oops;

import java.util.Arrays;
import java.util.List;

public class Student {
    private  int id;
    private  String name;
    private  int marks;
    
    public Student() {}
    
    public Student(int id,String name,int marks) {
    	this.id=id;
    	this.name=name;
    	this.marks=marks;
    }
    
    public int getMarks() {
       return marks;
    }
    
    public void getDetails() {
	      System.out.println("id : "+id );
	      System.out.println("name : "+name);
	      System.out.println("marks : "+marks);
    	
    }
    
    
    public static void main(String args[]) {
    	
    	Student s = new Student(1,"Towseef",55);
    	s.getDetails();
    	if(s.getMarks()>40) {
    		System.out.println("Pass");
    	}
    	else System.out.println("Fail");
    }
    
    
}
