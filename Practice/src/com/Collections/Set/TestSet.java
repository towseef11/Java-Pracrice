package com.Collections.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TestSet {
  public static void main(String[] args) {
	Set<String> hs = new HashSet<>();
	hs.add("Apple");
	hs.add("Ball");
	hs.add("Cat");
	hs.add("Dog");
	System.out.println(hs);
	
	SortedSet<String> ss = new TreeSet<>();
	ss.add("Ball");
	ss.add("Apple");
	ss.add("Cat");
	ss.add("Dog");
	System.out.println(ss);
	
	Set<String> lhs = new LinkedHashSet<>();
	lhs.add("Ball");
	lhs.add("Apple");
	lhs.add("Cat");
	lhs.add("Dog");
	System.out.println(lhs);
	
}
}
