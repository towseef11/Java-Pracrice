package com.oops;

import java.util.Arrays;
import java.util.List;

public class PassedStudents {
    private int id;
    private String name;
    private int marks;
    
    public PassedStudents() {}
    
    public PassedStudents(int id,String name,int marks) {
    	this.id=id;
    	this.name=name;
    	this.marks=marks;
    }
    
    public int getMarks() {
    	return marks;
    }
    
    @Override
    public String toString() {
    	return "Id ; "+id+" Name : "+name+" Marks : "+marks;
    }
    
    
    
    public static void main(String args[]) {
    	List<PassedStudents> list = Arrays.asList(
    			      new PassedStudents(1,"Towseef",84),
    			      new PassedStudents(2,"Murari",40),
    			      new PassedStudents(3,"Saket",50)
    			);
    	
    	for(PassedStudents ps:list) {
    		if(ps.marks>40) {
    			System.out.println(ps);
    		}
    	}
    }
    
}
