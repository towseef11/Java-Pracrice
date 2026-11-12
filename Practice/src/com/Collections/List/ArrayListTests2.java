package com.Collections.List;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class ArrayListTests2 {
      public static void main(String[] args) {
		List<Integer> al = new ArrayList<>();
		al.add(80);
		al.add(75);
		al.add(89);
		al.add(90);
		al.add(82);
		System.out.println(al);
        Collections.sort(al);
        System.out.println(al);
      }
}
