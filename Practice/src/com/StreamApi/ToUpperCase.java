package com.StreamApi;

import java.util.Arrays;
import java.util.List;

public class ToUpperCase {
   public static void main(String[] args) {
	List<String> list = Arrays.asList("java","spring boot","mysql");
	long count = list.stream()
	    .filter(x->x.length()>4)
	    .map(String::toUpperCase)
	    .count();
	System.out.println(count);
}
}
