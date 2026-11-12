package com.Collections.List;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Rough {
	public static void main(String[] args) {
       List<Integer> l = new CopyOnWriteArrayList<>();
       
       l.add(10);
       l.add(20);
       l.add(30);
       
       for(int i:l) {
    	   if(i==20) l.add(25);
       }
       System.out.println(l);
	}
}
