package com.Collections.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Movies implements Comparable<Movies> {
	
   String title;
   Double rating;
   
   public Movies(String title,Double rating) {
	   this.title = title;
	   this.rating = rating;
   }
   
   @Override
   public String toString() {
	   return "title : "+title +" rating : "+rating;
   }
   
   @Override
   public int compareTo(Movies o) {
	return Double.compare(this.rating, o.rating);
   }
   
   public static void main(String[] args) {
       List<Movies> al = new ArrayList<>();
       al.add(new Movies("Dhurandhar",9.5));
       al.add(new Movies("Dude",9.0));
       al.add(new Movies("OG",7.0));
       
       Collections.sort(al);
       for(Movies m : al) {
    	    System.out.println(m);
    	}   }

   
}
