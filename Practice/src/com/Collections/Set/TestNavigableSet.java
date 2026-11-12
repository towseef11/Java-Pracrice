package com.Collections.Set;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TestNavigableSet {
	public static void main(String[] args) {
        NavigableSet<Integer> ns = new TreeSet<>();
        
        ns.add(23);
        ns.add(10);
        ns.add(64);
        ns.add(13);
        ns.add(56);
        ns.add(77);
        
        System.out.println(ns.lower(23));
        System.out.println(ns.floor(23));
        System.out.println(ns.pollLast());
        System.out.println(ns.reversed());
        
	}
}
