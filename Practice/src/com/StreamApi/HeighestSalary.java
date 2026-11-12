package com.StreamApi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class HeighestSalary {
     private String name;
     private int id;
     private int salary;
     
     public HeighestSalary() {}
     public HeighestSalary(String name, int id, int salary) {
    	 this.name=name;
    	 this.id=id;
    	 this.salary=salary;
    	 
     }
     
     public int getSalary() {
    	 return salary;
     }
     
     public String name() {
    	 return name;
     }
     
     @Override
     public String toString() {
    	 return "name : "+name;
     }
     
     public static void main(String args[]) {
    	 List<HeighestSalary> emp = Arrays.asList(
    			 new HeighestSalary("Towseef",1,50000),
    			 new HeighestSalary("Murari",2,30000),
    			 new HeighestSalary("saket",3,55000)
    			 );
    	 
    	 Optional<HeighestSalary> high =emp.stream()
    			                        .max(Comparator.comparing(HeighestSalary::getSalary));
    	 
    	 high.ifPresent(System.out::println);
		 
     }
     
     
}
