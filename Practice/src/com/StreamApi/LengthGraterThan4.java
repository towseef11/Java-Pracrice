package com.StreamApi;

import java.util.Arrays;
import java.util.List;

public class LengthGraterThan4 {
      public static void main(String args[]) {
    	  List<String> names = Arrays.asList("Java","c","c#","Python","Servlets","djando");
    	  
    	  names.stream().filter(name -> name.length()<=4)
    	  .forEach(System.out::println);
      }
}
