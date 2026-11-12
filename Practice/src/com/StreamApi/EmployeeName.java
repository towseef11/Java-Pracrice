package com.StreamApi;

import java.util.Arrays;
import java.util.List;

public class EmployeeName {
    private String name;
    private int id;
    private int salary;
    
    public EmployeeName() {}
    public EmployeeName(String name,int id,int salary) {
    	this.name = name;
    	this.id = id;
    	this.salary = salary;
    }
    
    public int getSalary() {
    	return salary;
    }
    
    public String getName() {
    	return name;
    }
    
    @Override
    public String toString() {
    	return "name: "+name;
    }
    
    public static void main(String args[]) {
    	List<EmployeeName> emp = Arrays.asList(
    			  new EmployeeName("Towseef",1,45555),
    			  new EmployeeName("Andrew",2,45533),
    			  new EmployeeName("Raju", 3,40000)
    			);
    	
    	emp.stream()
    	.filter(e->e.getSalary()>45550)
    	.map(e->e.getName())
    	.forEach(System.out::println);
    	
    }
    
}
