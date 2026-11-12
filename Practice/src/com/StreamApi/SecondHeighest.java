package com.StreamApi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondHeighest {
       private String name;
       private int id;
       private int salary;
       
       public SecondHeighest() {}
       
       public SecondHeighest(String name,int id,int salary) {
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
    	   List<SecondHeighest> emp = Arrays.asList(
    			     new SecondHeighest("Towseef",1,45000),
    			     new SecondHeighest("Saket",2,78000),
    			     new SecondHeighest("Murari",3,50000),
    			     new SecondHeighest("Ramu",3,55000)
    			   );
    	   
    	   Optional<SecondHeighest> second=emp.stream()
    			   							  .sorted(Comparator
    			   							  .comparing(SecondHeighest::getSalary)
    			   							  .reversed())
    			   							  .skip(1)
    			   							  .findFirst();
    	   second.ifPresent(System.out::println);
       }
       
}
