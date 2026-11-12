package com.Collections.List;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest1 {
	public static void main(String[] args) {
        List<String> al = new ArrayList<>();
        al.add("Audi");
        al.add("BMW");
        al.add("Chavrolet");
        al.add("Dodge");
        System.out.println(al.reversed());

        System.out.println(al.contains("BMW"));       
        System.out.println("Postion of audi : "+al.indexOf("Audi"));
        al.clear();
        System.out.println(al.isEmpty());
	}
}
