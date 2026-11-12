package com.StreamApi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class NthHeighestSalary {
      private String name;
      private int id;
      private int salary;
      
      public NthHeighestSalary() {}
      public NthHeighestSalary(String name,int id,int salary) {
    	  this.name=name;
    	  this.id=id;
    	  this.salary=salary;
      }
      
      public String getName() {
    	  return name;
      }
      
      public int getSalary() {
    	  return salary;
      }
      
      @Override
      public String toString() {
    	  return "name : "+name;
      }
      
      public static void main(String args[]) {
    	  Scanner sc=new Scanner(System.in);
    	  System.out.println("Enter the nth highest number for salary :");
    	  int n=sc.nextInt();
    	  List<NthHeighestSalary> emp = Arrays.asList(
    			      new NthHeighestSalary("Towseef",1,45000),
    			      new NthHeighestSalary("Thota",1,50000),
    			      new NthHeighestSalary("Murari",1,60000),
    			      new NthHeighestSalary("Saket",1,65000),
    			      new NthHeighestSalary("Syam",1,70000)
    			  );
    	  
    	  Optional<NthHeighestSalary> nth = 
    			  emp.stream().sorted(Comparator.comparing(NthHeighestSalary::getSalary).reversed())
    			  .skip(n-1).findFirst();
    	  
    	  nth.ifPresent(System.out::println);
      }
      
}
