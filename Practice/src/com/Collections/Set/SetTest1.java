package com.Collections.Set;

import java.util.Set;
import java.util.TreeSet;

public class SetTest1 {
	public static void main(String[] args) {
        Set<Integer> s = new TreeSet<>();
        s.add(1);
        s.add(3);
        s.add(2);
        s.add(74);
        s.add(10);
        
        s.add(1);
       
        System.out.println(s);
	}
}
